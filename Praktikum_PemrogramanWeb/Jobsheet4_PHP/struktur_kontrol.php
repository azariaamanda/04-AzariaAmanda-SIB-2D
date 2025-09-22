<?php
$nilaiNumerik = 92;

if ($nilaiNumerik >= 90 && $nilaiNumerik <= 100) {
    echo "Nilai huruf: A";
} elseif ($nilaiNumerik >= 80 && $nilaiNumerik < 90) {
    echo "Nilai huruf: B";
} elseif ($nilaiNumerik >= 70 && $nilaiNumerik < 80) {
    echo "Nilai huruf: C";
} elseif ($nilaiNumerik < 70) {
    echo "Nilai huruf: D";
}

$jarajSaatIni = 0;
$jarakTarget = 500;
$peningkatanHarian = 30;
$hari = 0;

while ($jarajSaatIni < $jarakTarget) {
    $jarajSaatIni += $peningkatanHarian;
    $hari++;
}

echo "<br><br>";
echo "Atlet tersebut memerlukan $hari hari untuk mencapai jarak 500 kilometer.";

$jumlahLahan = 10;
$tanamanPerLahan = 5;
$buahPerTanaman = 10;
$jumlahBuah = 0;

for ($i = 1; $i <= $jumlahLahan; $i++) {
    $jumlahBuah += ($tanamanPerLahan * $buahPerTanaman);
}

echo "<br><br>";
echo "Jumlah buah yang akan dipanen adalah: $jumlahBuah";

$skorUjian = [85, 92, 78, 96, 88];
$totalSkor = 0;

foreach ($skorUjian as $skor) {
    $totalSkor += $skor;
}

echo "<br><br>";
echo "Total skor ujian adalah: $totalSkor";

$nilaiSiswa = [85, 92, 58, 64, 90, 55, 88, 79, 70, 96];

echo "<br><br>";
foreach ($nilaiSiswa as $nilai) {
    if ($nilai < 60) {
        echo "Nilai: $nilai (Tidak lulus) <br>";
        continue;
    }
    echo "Nilai: $nilai (Lulus) <br>";
}

$nilaiSiswa = [85, 92, 78, 64, 90, 75, 88, 79, 70, 96];
$terbesar1 = 0;
$terbesar2 = 0;
$terkecil1 = 100;
$terkecil2 = 100;
$totalNilai = 0;

foreach ($nilaiSiswa as $nilai) {
    if ($nilai > $terbesar1) {
        $terbesar2 = $terbesar1;
        $terbesar1 = $nilai;
    } elseif ($nilai > $terbesar2) {
        $terbesar2 = $nilai;
    }

    if ($nilai < $terkecil1) {
        $terkecil2 = $terkecil1;
        $terkecil1 = $nilai;
    } elseif ($nilai < $terkecil2) {
        $terkecil2 = $nilai;
    }
}

foreach ($nilaiSiswa as $nilai) {
    if ($nilai == $terbesar1 || $nilai == $terbesar2 || $nilai == $terkecil1 || $nilai == $terkecil2) {
        continue;
    }
    $totalNilai += $nilai;
}

$rataRata = $totalNilai / 6;

echo "<br>";
echo "Total nilai tanpa 2 tertinggi & 2 terendah adalah: $totalNilai <br>";
echo "Rata-rata nilai adalah: $rataRata";
?>
