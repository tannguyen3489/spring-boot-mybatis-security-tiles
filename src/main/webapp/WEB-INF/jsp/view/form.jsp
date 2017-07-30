<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Login page</title>
</head>
<body>
<h1>Login page</h1>
<p class="error">Wrong user or password</p>
<form action="{{callbackUrl}}" method="POST">
    <input type="text" name="username" value=""/>
    <p/>
    <input type="password" name="password" value=""/>
    <p/>
    <input type="submit" name="submit" value="Submit"/>
</form>
</body>
</html>