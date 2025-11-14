<?php
require __DIR__ . '/koneksi.php';

if ($_SERVER['REQUEST_METHOD'] !== 'POST') {
    http_response_code(405);
    exit('Method not allowed');
}

$id_beasiswa = (int)($_POST['id_beasiswa'] ?? 0);
if ($id_beasiswa <= 0) {
    http_response_code(400);
    exit('ID tidak valid.');
}

try {
    qparams('DELETE FROM public.tb_beasiswa WHERE id_beasiswa=$1', [$id_beasiswa]);
    header('Location: index.php');
    exit;
} catch (Throwable $e) {
    http_response_code(500);
    echo 'Gagal menghapus: ' . htmlspecialchars($e->getMessage());
}

