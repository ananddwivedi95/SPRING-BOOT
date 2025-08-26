<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Success</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin-top: 100px; }
        h2 { color: green; }
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
        .btn:hover { background-color: #218838; }
    </style>
</head>
<body>

<h2>Login Successful!</h2>
<p>Welcome back, you are logged in.</p>

<!-- You can redirect to home/dashboard -->
<form action="<%=request.getContextPath()%>/home" method="get">
    <button type="submit" class="btn">Go to Dashboard</button>
</form>

</body>
</html>
