<html>
<head>
    <title>Login</title>
    <link href="https://cdn.bootcss.com/twitter-bootstrap/4.1.3/css/bootstrap.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/twitter-bootstrap/4.1.3/js/bootstrap.js"></script>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <div class="py-5 text-center">
        <h2>Welcome to sign on</h2>
    </div>
    <div class="row">
        <div class="col-md-8 offset-md-2 order-md-1">
            <form class="needs-validation" novalidate>
                <div class="mb-3">
                    <label for="username">Username</label>
                    <div class="input-group">
                        <input type="text" class="form-control" name="username"
                               placeholder="Username"
                               required>
                        <div class="invalid-feedback" style="width: 100%;">
                            Your username is required.
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" name="email"
                           placeholder="you@example.com">
                    <div class="invalid-feedback">
                        Please enter a valid email address for shipping updates.
                    </div>
                </div>

                <div class="mb-3">
                    <label for="gender">Gender</label>
                    <select class="custom-select d-block w-100" name="gender" required>
                        <option value="1">男</option>
                        <option value="0">女</option>
                    </select>
                    <div class="invalid-feedback">
                        Please enter your shipping address.
                    </div>
                </div>

                <div class="mb-3">
                    <label for="address2">Password</label>
                    <input type="password" class="form-control" name="password" placeholder="">
                </div>

                <div class="mb-3">
                    <label for="address2">Confirm Password</label>
                    <input type="password" class="form-control" name="password" placeholder="">
                </div>
                <hr class="mb-4">
                <button class="btn btn-primary btn-lg btn-block" type="submit">Sign on</button>
            </form>
        </div>
    </div>

    <footer class="my-5 pt-5 text-muted text-center text-small">
        <p class="mb-1">&copy; 2017-2018 LMS</p>
    </footer>
</div>
</body>
</html>