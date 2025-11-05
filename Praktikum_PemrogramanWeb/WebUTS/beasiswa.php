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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Beasiswa Dunia | ScholarPath</title>
    <link rel="stylesheet" href="css/style-beasiswa.css">
</head>
<body>
    <header class="navbar">
        <div class="brand">
            <img src="Gambar/LogoScolarPathNoBG.png" alt="ScholarPath Logo" style="height:50px;">
        </div>
        <nav>
            <ul class="nav-links">
                <li><a href="index.html">Home</a></li>

                <li>
                    <details class="dropdown">
                        <summary>Beasiswa</summary>
                        <div class="dropdown-menu">
                            <a href="beasiswa-asia.html">Beasiswa Asia</a>
                            <a href="beasiswa-luarasia.html">Beasiswa Luar Asia</a>
                        </div>
                    </details>
                </li>

                <li>
                    <details class="dropdown">
                        <summary>Universitas</summary>
                        <div class="dropdown-menu">
                            <a href="kampus-asia.html">Universitas Asia</a>
                            <a href="kampus-dunia.html">Universitas Dunia</a>
                        </div>
                    </details>
                </li>

                <li><a href="InfoTips.html">Info & Tips</a></li>
            </ul>
        </nav>
    </header>

    <section class="page-hero">
        <h1>Beasiswa Dunia</h1>
        <p>Jelajahi berbagai program beasiswa bergengsi di berbagai negara dari dukungan pemerintah hingga universitas ternama.</p>
    </section>

    <main class="content">
        <div class="tools">
            <input id="searchBeasiswa" type="text" placeholder="Cari beasiswa...">
        </div>

        <div id="beasiswaList" class="grid">
            <?php
            if (pg_num_rows($result) > 0) {
                while ($row = pg_fetch_assoc($result)) {
                    $status = strtolower($row['status']) == 'open' ? '✅ OPEN' : '❌ CLOSE';
                    $statusClass = strtolower($row['status']) == 'open' ? 'status-badge' : 'status-badgeclose';

                    echo "
                    <div class='scholarship-card'>
                        <div class='$statusClass'>$status</div>
                            <div class='card-header'>
                                <div class='country'>
                                    <div class='country-icon'>
                                        <img src='{$row['logo_path']}' alt='{$row['nama_beasiswa']}'>
                                    </div>
                                    <div class='country-name'>
                                        <p><img src='Gambar/iconLoc.jpg' alt='Lokasi' class='icon-loc'><b>{$row['negara']}</b></p>
                                        <h2 class='scholarship-title'>
                                            <a href='{$row['link_url']}' target='_blank' class='title-link'>{$row['nama_beasiswa']}</a>
                                        </h2>
                                    <div class='tags'>
                                        <b class='tag'>{$row['tingkat']}</b>
                                        <b class='tag green'>$ {$row['funding_type']}</b>
                                    </div>
                                    <div class='duration-box'>
                                        <p>Duration: <b>{$row['duration']}</b></p>
                                        <hr>
                                        <div class='date-row'>
                                            <p class='open'><span class='dot green-dot'></span> Open: <b>{$row['open_date']}</b></p>
                                            <p class='close'><span class='dot red-dot'></span> Close: <b>{$row['close_date']}</b></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>";
                }
            } else {
                echo "<p style='text-align:center;'>Belum ada data beasiswa di database.</p>";
            }
            ?>
        </div>
    </main>
</body>
</html>
