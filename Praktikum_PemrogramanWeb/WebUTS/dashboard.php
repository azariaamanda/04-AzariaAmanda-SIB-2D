<?php
session_start();
require __DIR__ . '/koneksi.php';

// Ambil semua data
$res = q("SELECT id_beasiswa, nama_beasiswa, universitas, negara, tingkat, status,
          funding_type, duration,
          open_date,
          close_date,
          logo_path, link_url
          FROM public.tb_beasiswa
          ORDER BY id_beasiswa DESC");

$rows = pg_fetch_all($res) ?: [];
if (!isset($_SESSION['user_id'])) {
    header('Location: login.php');
    exit;
}
?>
<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8">
  <title>Dashboard</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body class="bg-light">
  <div class="container py-4">

    <div class="mb-4">
      <h1 class="text-primary fw-bold">
        Selamat datang, <?= htmlspecialchars($_SESSION['full_name'] ?? $_SESSION['username']) ?>
      </h1>
      <p class="text-muted mb-0">Ini adalah halaman yang hanya bisa diakses setelah login.</p>
    </div>

    <div class="d-flex justify-content-between align-items-center mb-3">
      <h2 class="h4 fw-semibold">Data Beasiswa</h2>
      <div>
        <a href="create.php" class="btn btn-primary btn-sm me-2">+ Tambah Beasiswa</a>
        <a href="index.html" class="btn btn-primary btn-sm">Lihat Website</a>
      </div>
    </div>

    <div class="table-responsive">
      <table class="table table-bordered table-striped align-middle">
        <thead class="table-light text-center">
          <tr>
            <th>ID</th>
            <th>Nama Beasiswa</th>
            <th>Universitas</th>
            <th>Negara</th>
            <th>Tingkat</th>
            <th>Status</th>
            <th>Funding Type</th>
            <th>Duration</th>
            <th>Open Date</th>
            <th>Close Date</th>
            <th>Logo</th>
            <th>Link</th>
            <th>Aksi</th>
          </tr>
        </thead>

        <tbody>
          <?php if (!$rows): ?>
            <tr>
              <td colspan="13" class="text-center text-muted py-3">Belum ada data.</td>
            </tr>
          <?php else: foreach ($rows as $r): ?>
            <tr>
              <td><?= htmlspecialchars($r['id_beasiswa'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['nama_beasiswa'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['universitas'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['negara'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['tingkat'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['status'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['funding_type'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['duration'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['open_date'] ?? '') ?></td>
              <td><?= htmlspecialchars($r['close_date'] ?? '') ?></td>

              <td class="text-center">
                <?php if (!empty($r['logo_path'])): ?>
                  <img src="<?= htmlspecialchars($r['logo_path']) ?>" alt="logo" class="img-fluid rounded" style="max-width:50px;">
                <?php else: ?>
                  <span class="text-muted">-</span>
                <?php endif; ?>
              </td>

              <td class="text-center">
                <?php if (!empty($r['link_url'])): ?>
                  <a href="<?= htmlspecialchars($r['link_url']) ?>" target="_blank" class="btn btn-info btn-sm text-white">Visit</a>
                <?php else: ?>
                  <span class="text-muted">-</span>
                <?php endif; ?>
              </td>

              <td class="text-center">
            <div class="d-flex justify-content-center gap-2">
              <a href="edit.php?id_beasiswa=<?= urlencode($r['id_beasiswa']) ?>" class="btn btn-warning btn-sm">Ubah</a>
              <form id="deleteForm<?= $r['id_beasiswa'] ?>" action="delete.php" method="post" class="d-inline">
                <input type="hidden" name="id_beasiswa" value="<?= htmlspecialchars($r['id_beasiswa']) ?>">
                <button type="button" class="btn btn-danger btn-sm"
                  onclick="if(confirm('Hapus data ini?')) document.getElementById('deleteForm<?= $r['id_beasiswa'] ?>').submit();">
                  Hapus
                </button>
                </form>
              </td>
            </tr>
          <?php endforeach; endif; ?>
        </tbody>
      </table>
    </div>

    <div class="mt-4">
      <a href="logout.php" class="btn btn-danger btn-sm">Logout</a>
    </div>

  </div>
</body>
</html>
