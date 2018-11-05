<html>
<head>
    <title>Login</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.1.3/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.1.3/js/bootstrap.js"></script>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<form action="/login" method="post" class="form-signin"
      style="width: 100%;max-width: 420px;padding: 15px;margin: 0 auto;">
    <div class="text-center mb-4">
        <h1 class="h3 mb-3 font-weight-normal">Sign in</h1>
    </div>
    <div class="form-label-group">
        <label for="inputEmail">Username</label>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="text" name="username" class="form-control" placeholder="Username" required
               autofocus>
    </div>
    <div class="form-label-group">
        <label for="inputPassword">Password</label>
        <input type="password" name="password" class="form-control" placeholder="Password"
               required>
    </div>
    <div class="checkbox mb-3">
        <label>
            <input type="checkbox" value="remember-me"> Remember me
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>
</form>
</body>
</html>