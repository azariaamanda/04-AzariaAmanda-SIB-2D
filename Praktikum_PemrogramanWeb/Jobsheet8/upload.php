<?php
    if(isset($_POST["submit"])){
        $targetdir = "uploads/";
        $targetfile = $targetdir . basename($_FILES["myfile"]["name"]);
        $fileType = strtolower(pathinfo($targetfile, PATHINFO_EXTENSION));

        $allowedExtensions = array("jpg", "jpeg", "png", "gif");
        $maxsize = 5*1024*1024;

        if(in_array($fileType, $allowedExtensions) && $_FILES["myfile"]["size"]<=$maxsize){
            if(move_uploaded_file($_FILES["myfile"]["tmp_name"], $targetfile)){
                echo "File berhasil diunggah.<br><br>";
                echo "<b>Berikut gambar yang sudah terupload:</b><br>";
                echo "<img src='$targetfile' width='200' style='height:auto; border:2px solid #ccc; border-radius:10px;'>";
            } else {
                echo "Gagal mengunggal file.";
            }
        } else {
            echo "File tidak valid atau melebihi ukuran maksimum yang diizinkan";
        }
    }
?>