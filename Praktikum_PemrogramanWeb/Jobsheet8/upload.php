<?php
if(isset($_POST["submit"])){
    $targetdir = "uploads/";
    $targetfile = $targetdir . basename($_FILES["myfile"]["name"]){
        echo "File berhasil diunggah.";
    }
    else{
        echo "Gagal mengunggah file.";
    }
}
?>