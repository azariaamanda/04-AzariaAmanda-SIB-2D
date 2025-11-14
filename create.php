<?php
require __DIR__ . '/koneksi.php';

$err = $ok = '';
$nama_beasiswa = $universitas = $negara = $tingkat = $status = $funding_type =
$duration = $open_date = $close_date = $logo_path = $link_url = '';

if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $nama_beasiswa = trim($_POST['nama_beasiswa'] ?? '');
    $universitas   = trim($_POST['universitas'] ?? '');
    $negara        = trim($_POST['negara'] ?? '');
    $tingkat       = trim($_POST['tingkat'] ?? '');
    $status        = trim($_POST['status'] ?? '');
    $funding_type  = trim($_POST['funding_type'] ?? '');
    $duration      = trim($_POST['duration'] ?? '');
    $open_date     = trim($_POST['open_date'] ?? '');
    $close_date    = trim($_POST['close_date'] ?? '');
    $logo_path     = trim($_POST['logo_path'] ?? '');
    $link_url      = trim($_POST['link_url'] ?? '');

    if ($nama_beasiswa === '' || $universitas === '') {
        $err = 'Nama beasiswa dan universitas wajib diisi.';
    } else {
        try {
            qparams(
                'INSERT INTO public."tb_beasiswa"
                (nama_beasiswa, universitas, negara, tingkat, status, funding_type, duration, open_date, close_date, logo_path, link_url)
                VALUES ($1,$2,$3,$4,$5,$6,$7,$8,$9,$10,$11)',
                [
                    $nama_beasiswa, $universitas, $negara, $tingkat, $status,
                    $funding_type, $duration, $open_date, $close_date, $logo_path, $link_url
                ]
            );

            header('Location: dashboard.php');
            exit;
        } catch (Throwable $e) {
            $err = $e->getMessage();
        }
    }
}
?>
<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8">
  <title>Tambah Beasiswa</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</head>
<body class="bg-light">
  <div class="container py-5">
    <div class="card shadow-sm">
      <div class="card-body">
        <h1 class="h3 mb-4">Tambah Beasiswa</h1>

        <?php if ($err): ?>
          <div class="alert alert-danger"><?= htmlspecialchars($err) ?></div>
        <?php endif; ?>

        <form method="post">
          <div class="mb-3">
            <label class="form-label">Nama Beasiswa</label>
            <input class="form-control" name="nama_beasiswa" value="<?= htmlspecialchars($nama_beasiswa) ?>" placeholder="Masukkan nama beasiswa" required>
          </div>

          <div class="mb-3">
            <label class="form-label">Universitas</label>
            <input class="form-control" name="universitas" value="<?= htmlspecialchars($universitas) ?>" placeholder="Masukkan nama universitas" required>
          </div>

          <div class="mb-3">
            <label class="form-label">Negara</label>
            <input class="form-control" name="negara" value="<?= htmlspecialchars($negara) ?>" placeholder="Masukkan negara">
          </div>

          <div class="mb-3">
            <label class="form-label">Tingkat</label>
            <select class="form-select" name="tingkat">
              <option <?= $tingkat=='S1'?'selected':'' ?>>S1</option>
              <option <?= $tingkat=='S2'?'selected':'' ?>>S2</option>
              <option <?= $tingkat=='S3'?'selected':'' ?>>S3</option>
              <option <?= $tingkat=='Other'?'selected':'' ?>>Other</option>
            </select>
          </div>

          <div class="mb-3">
            <label class="form-label">Status</label>
            <select class="form-select" name="status">
              <option <?= $status=='Open'?'selected':'' ?>>Open</option>
              <option <?= $status=='Close'?'selected':'' ?>>Close</option>
              <option <?= $status=='Coming Soon'?'selected':'' ?>>Coming Soon</option>
            </select>
          </div>

          <div class="mb-3">
            <label class="form-label">Funding Type</label>
            <select class="form-select" name="funding_type">
              <option <?= $funding_type=='Full'?'selected':'' ?>>Full</option>
              <option <?= $funding_type=='Partial'?'selected':'' ?>>Partial</option>
            </select>
          </div>

          <div class="mb-3">
            <label class="form-label">Duration</label>
            <input class="form-control" name="duration" value="<?= htmlspecialchars($duration) ?>" placeholder="Contoh: 2 tahun">
          </div>

          <div class="row">
            <div class="col-md-6 mb-3">
              <label class="form-label">Open Date</label>
              <input class="form-control" type="date" name="open_date" value="<?= htmlspecialchars($open_date) ?>">
            </div>
            <div class="col-md-6 mb-3">
              <label class="form-label">Close Date</label>
              <input class="form-control" type="date" name="close_date" value="<?= htmlspecialchars($close_date) ?>">
            </div>
          </div>

          <div class="mb-3">
            <label class="form-label">Logo Path (opsional)</label>
            <input class="form-control" name="logo_path" value="<?= htmlspecialchars($logo_path) ?>" placeholder="/img/contoh.jpg">
          </div>

          <div class="mb-3">
            <label class="form-label">Link URL (opsional)</label>
            <input class="form-control" name="link_url" value="<?= htmlspecialchars($link_url) ?>" placeholder="https://contoh.com">
          </div>

          <div class="d-flex justify-content-between mt-4">
            <button class="btn btn-success" type="submit">Simpan</button>
            <a class="btn btn-secondary" href="dashboard.php">Kembali</a>
          </div>
        </form>
      </div>
    </div>
  </div>
</body>
</html>
