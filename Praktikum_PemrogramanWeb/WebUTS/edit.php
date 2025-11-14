<?php
require __DIR__ . '/koneksi.php';

$err = '';
$id = (int)($_GET['id_beasiswa'] ?? 0);

if ($id <= 0) {
    http_response_code(400);
    exit('ID tidak valid.');
}

// Ambil data lama
try {
    $res = qparams('SELECT * FROM public."tb_beasiswa" WHERE id_beasiswa=$1', [$id]);
    $row = pg_fetch_assoc($res);
    if (!$row) {
        http_response_code(404);
        exit('Data tidak ditemukan.');
    }
} catch (Throwable $e) {
    exit('Error: ' . htmlspecialchars($e->getMessage()));
}

$nama_beasiswa = $row['nama_beasiswa'];
$universitas   = $row['universitas'];
$negara        = $row['negara'];
$tingkat       = $row['tingkat'];
$status        = $row['status'];
$funding_type  = $row['funding_type'];
$duration      = $row['duration'];
$open_date     = $row['open_date'];
$close_date    = $row['close_date'];
$logo_path     = $row['logo_path'];
$link_url      = $row['link_url'];

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

    if ($nama_beasiswa === '') {
        $err = 'Nama beasiswa wajib diisi.';
    } else {
        try {
            qparams(
                'UPDATE public.tb_beasiswa
                SET nama_beasiswa=$1, universitas=$2, negara=$3, tingkat=$4,
                    status=$5, funding_type=$6, duration=$7, open_date=$8,
                    close_date=$9, logo_path=$10, link_url=$11
                WHERE id_beasiswa=$12',
              [
                  $nama_beasiswa, $universitas, $negara, $tingkat,
                  $status, $funding_type, $duration, $open_date,
                  $close_date, $logo_path, $link_url, $id
              ]
            );

            header('Location: index.php?msg=' . urlencode('Berhasil memperbarui data.'));
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
  <title>Ubah Beasiswa</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
  <div class="container py-5">
    <div class="row justify-content-center">
      <div class="col-md-8 col-lg-6">
        <div class="card shadow-sm">
          <div class="card-body p-4">
            <h3 class="mb-4 text-center">Ubah Beasiswa</h3>

            <?php if ($err): ?>
              <div class="alert alert-danger"><?= htmlspecialchars($err) ?></div>
            <?php endif; ?>

            <form method="post">

              <div class="mb-3">
                <label class="form-label">Nama Beasiswa</label>
                <input class="form-control" name="nama_beasiswa" value="<?= htmlspecialchars($nama_beasiswa) ?>" required>
              </div>

              <div class="mb-3">
                <label class="form-label">Universitas</label>
                <input class="form-control" name="universitas" value="<?= htmlspecialchars($universitas) ?>">
              </div>

              <div class="mb-3">
                <label class="form-label">Negara</label>
                <input class="form-control" name="negara" value="<?= htmlspecialchars($negara) ?>">
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
                <input class="form-control" name="duration" value="<?= htmlspecialchars($duration) ?>">
              </div>

              <div class="mb-3">
                <label class="form-label">Open Date</label>
                <input class="form-control" type="date" name="open_date" value="<?= htmlspecialchars($open_date) ?>">
              </div>

              <div class="mb-3">
                <label class="form-label">Close Date</label>
                <input class="form-control" type="date" name="close_date" value="<?= htmlspecialchars($close_date) ?>">
              </div>

              <div class="mb-3">
                <label class="form-label">Logo Path</label>
                <input class="form-control" type="text" name="logo_path" placeholder="contoh: /uploads/logo.png" value="<?= htmlspecialchars($logo_path ?? '') ?>">
              </div>

              <div class="mb-3">
                <label class="form-label">Link Informasi</label>
                <input class="form-control" type="url" name="link_url" value="<?= htmlspecialchars($link_url) ?>">
              </div>

              <div class="d-flex justify-content-between mt-4">
                <button class="btn btn-success" type="submit">Simpan Perubahan</button>
                <a class="btn btn-secondary" href="dashboard.php">Batal</a>
              </div>

            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
