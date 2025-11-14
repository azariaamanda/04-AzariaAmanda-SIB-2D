<?php
session_start();
// jika sudah login, redirect ke dashboard
if (isset($_SESSION['user_id'])) {
    header('Location: dashboard.php');
    exit;
}
?>
<!doctype html>
<html lang="id">
<head>
  <meta charset="utf-8">
  <title>Login</title>
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
</head>
<body class="bg-light d-flex align-items-center justify-content-center vh-100">

  <div class="card shadow-sm border-0 p-4" style="max-width: 420px; width: 100%;">
    <h2 class="text-center text-info fw-bold mb-4">Masuk ke ScholarPath</h2>

    <?php if (!empty($_GET['error'])): ?>
      <div class="alert alert-danger text-center py-2"><?= htmlspecialchars($_GET['error']) ?></div>
    <?php endif; ?>

    <form action="authenticate.php" method="post" autocomplete="off">
      <div class="mb-3">
        <label for="username" class="form-label fw-semibold">Username</label>
        <input id="username" name="username" type="text" class="form-control" required autofocus>
      </div>

      <div class="mb-3">
        <label for="password" class="form-label fw-semibold">Password</label>
        <input id="password" name="password" type="password" class="form-control" required>
      </div>

      <div class="d-grid mb-3">
        <button type="submit" class="btn btn-info text-white fw-semibold">Login</button>
      </div>

      <div class="text-center">
        <span>Belum punya akun?</span>
        <a href="register.php" class="text-decoration-none">Register</a>
      </div>
    </form>
  </div>
</body>
</html>