<form action="/login" method="post">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    <input name="username" type="text" />
    <input name="password" type="password" />
    <input type="submit" />
</form>