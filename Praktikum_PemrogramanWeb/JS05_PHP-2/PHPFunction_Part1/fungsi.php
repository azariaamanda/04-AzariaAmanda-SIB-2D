<?php
function perkenalan($nama, $salam){
    echo $salam."<br/>";
    echo "Perkenalkan, nama saya ".$nama."<br/>";
    echo "Senang berkenalan dengan Anda<br/>";
}

//memanggil fungsi yang sudah dibuat
perkenalan("Hamdana", "Hallo");

echo "<hr/>";

$saya = "Elok";
$sucapanSalam = "Selamat pagi!";

//memanggil lagi
perkenalan($saya, $sucapanSalam);
?>