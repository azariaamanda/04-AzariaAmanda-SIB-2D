<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data Dosen</title>
    <link rel="stylesheet" type="text/css" href="styleArray2.css">
</head>

<body>
    <hr>
    <?php
        $Dosen = [
            'nama' => 'Elok Nur Hamdana',
            'domisili' => 'Malang' ,
            'jenis_kelamin' => 'Perempuan'
        ];
        
        echo "Nama : {$Dosen ['nama']} <br>";
        echo "Domisili : {$Dosen ['domisili']} <br>";
        echo "Jenis Kelamin : {$Dosen ['jenis_kelamin']} <br>";

    ?>
</body>
</html>