<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Successful</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 100px;
        }
        h2 {
            color: green;
        }
        .btn {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #28a745;
            border: none;
            border-radius: 5px;
            color: white;
            cursor: pointer;
            font-size: 16px;
        }
        .btn:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

<h2>Registration Successful!</h2>
<p>You can now log in with your credentials.</p>

<!-- Button will trigger GET /login -->
<form action="<%=request.getContextPath()%>/login" method="get">
    <button type="submit" class="btn">Login</button>
</form>

</body>
</html>
