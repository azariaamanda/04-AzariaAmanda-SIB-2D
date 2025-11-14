<?php
$host = "localhost";
$port = "5432";
$dbname = "scholarpath_db";
$user = "postgres";
$password = "bakmi2";

$conn_string = "host=$host port=$port dbname=$dbname user=$user password=$password";
$conn = pg_connect($conn_string);

if (!$conn) {
  die("Koneksi database gagal!");
}

$sql = "SELECT * FROM tb_beasiswa ORDER BY negara ASC";
$result = pg_query($conn, $sql);
?>

<!DOCTYPE html>
<html lang="id">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Daftar Beasiswa Dunia | ScholarPath</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<nav class="navbar navbar-expand-lg bg-body-tertiary sticky-top shadow-sm py-2 px-5">
  <div class="container-fluid">
    <a class="navbar-brand d-flex align-items-center gap-2" href="#">
      <img src="Gambar/LogoScolarPathNoBG.png" alt="ScholarPath" height="50">
    </a>

    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
      <ul class="navbar-nav align-items-lg-center gap-3">
        <li class="nav-item"><a class="nav-link text-dark fw-medium" href="index.html">Home</a></li>

        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-dark fw-medium" href="#" role="button" data-bs-toggle="dropdown">Beasiswa</a>
          <ul class="dropdown-menu shadow">
            <li><a class="dropdown-item" href="beasiswa-asia.html">Beasiswa Asia</a></li>
            <li><a class="dropdown-item" href="beasiswa-luarasia.html">Beasiswa Luar Asia</a></li>
          </ul>
        </li>

        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle text-dark fw-medium" href="#" role="button" data-bs-toggle="dropdown">Universitas</a>
          <ul class="dropdown-menu shadow">
            <li><a class="dropdown-item" href="kampus-asia.html">Universitas Asia</a></li>
            <li><a class="dropdown-item" href="kampus-dunia.html">Universitas Dunia</a></li>
          </ul>
        </li>

        <li class="nav-item"><a class="nav-link text-dark fw-medium" href="InfoTips.html">Info & Tips</a></li>

        <li class="nav-item">
          <a href="logout.php" class="btn btn-outline-danger rounded-pill px-4 fw-semibold">Admin</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<section class="text-white bg-info py-5 px-5 text-center">
  <div class="container">
    <h1 class="fw-bold mb-3">Beasiswa Dunia</h1>
    <p class="lead mb-0">Jelajahi berbagai program beasiswa bergengsi dari seluruh dunia untuk mendukung impian akademikmu.</p>
  </div>
</section>

<main class="container my-5">

  <div class="d-flex justify-content-center mb-5">
    <input id="searchBeasiswa" type="text" class="form-control form-control-lg w-75 rounded-3 border-1" placeholder="Cari beasiswa...">
  </div>

  <div id="beasiswaList" class="d-flex flex-column align-items-center gap-4">
    <?php if (pg_num_rows($result) > 0): ?>
      <?php while ($row = pg_fetch_assoc($result)): ?>
        <?php
          $isOpen = strtolower($row['status']) == 'open';
          $status = $isOpen ? '✅ OPEN' : '❌ CLOSE';
          $statusClass = $isOpen
            ? 'bg-success-subtle text-success border-success'
            : 'bg-danger-subtle text-danger border-danger';
        ?>

        <div class="card w-75 border border-info rounded-4 shadow-sm">
          <div class="card-body p-4 position-relative">

            <span class="position-absolute top-0 end-0 translate-middle-y me-3 mt-4 border <?= $statusClass ?> fw-bold px-3 py-1 rounded-pill small"><?= $status ?></span>

            <div class="row align-items-center g-4">

              <div class="col-md-4 text-center">
                <img src="<?= $row['logo_path'] ?>" class="img-fluid rounded-3 border" alt="<?= $row['nama_beasiswa'] ?>">
              </div>

              <div class="col-md-8">
                <p class="mb-1 text-muted">
                  <img src="Gambar/iconLoc.jpg" width="16" height="16" class="me-1 align-middle">
                  <b><?= $row['negara'] ?></b>
                </p>

                <h4 class="fw-bold text-primary">
                  <a href="<?= $row['link_url'] ?>" target="_blank" class="text-decoration-none text-primary"><?= $row['nama_beasiswa'] ?></a>
                </h4>

                <div class="mb-3">
                  <span class="badge bg-info-subtle text-info rounded-pill me-2 px-3 py-2"><?= $row['tingkat'] ?></span>
                  <span class="badge bg-success-subtle text-success rounded-pill px-3 py-2">$ <?= $row['funding_type'] ?></span>
                </div>

                <div class="bg-white border border-info rounded-3 p-3 mt-3">
                <p class="mb-1 small">Duration: <b><?= $row['duration'] ?></b></p>
                <hr class='my-2'>
                    <div class="d-flex justify-content-between align-items-center small mt-2">
                        <p class="mb-0 text-success">
                        <span class="badge bg-success rounded-circle me-1">&nbsp;</span>
                        Open: <b><?= $row['open_date'] ?></b>
                        </p>
                        <p class="mb-0 text-danger">
                        <span class="badge bg-danger rounded-circle me-1">&nbsp;</span>
                        Close: <b><?= $row['close_date'] ?></b>
                        </p>
                    </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      <?php endwhile; ?>
    <?php else: ?>
      <p class="text-center">Belum ada data beasiswa di database.</p>
    <?php endif; ?>
  </div>
</main>

<footer class="bg-info text-white text-center py-3 small">
  &copy; 2025 ScholarPath | All Rights Reserved
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
