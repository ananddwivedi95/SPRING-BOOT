<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Failed</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin-top: 100px; }
        h2 { color: red; }
        .btn {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #dc3545;
            border: none;
            border-radius: 5px;
            color: white;
            cursor: pointer;
            font-size: 16px;
        }
        .btn:hover { background-color: #b02a37; }
    </style>
</head>
<body>

<h2>Login Failed!</h2>
<p>Invalid Gmail or Password. Please try again.</p>

<!-- Retry button (GET /login) -->
<form action="<%=request.getContextPath()%>/login" method="get">
    <button type="submit" class="btn">Retry</button>
</form>

</body>
</html>
