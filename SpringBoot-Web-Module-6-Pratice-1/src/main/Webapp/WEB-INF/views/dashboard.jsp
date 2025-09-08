<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dashboard - Welcome</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: white;
        }

        .dashboard-container {
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            padding: 40px;
            border-radius: 20px;
            box-shadow: 0 15px 35px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 400px;
        }

        h1 {
            margin-bottom: 30px;
            font-size: 2.5em;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
        }

        .welcome-text {
            margin-bottom: 40px;
            font-size: 1.2em;
            line-height: 1.6;
        }

        .button-container {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .btn {
            padding: 15px 30px;
            border: none;
            border-radius: 50px;
            font-size: 1.1em;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.3s ease;
            text-decoration: none;
            display: inline-block;
            width: 200px;
            margin: 0 auto;
        }

        .btn-login {
            background: linear-gradient(45deg, #28a745, #20c997);
            color: white;
            box-shadow: 0 5px 15px rgba(40, 167, 69, 0.4);
        }

        .btn-login:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 20px rgba(40, 167, 69, 0.6);
        }

        .btn-register {
            background: linear-gradient(45deg, #007bff, #0056b3);
            color: white;
            box-shadow: 0 5px 15px rgba(0, 123, 255, 0.4);
        }

        .btn-register:hover {
            transform: translateY(-3px);
            box-shadow: 0 8px 20px rgba(0, 123, 255, 0.6);
        }

        .btn:active {
            transform: translateY(-1px);
        }
    </style>
</head>
<body>

<div class="dashboard-container">
    <h1>👋 Welcome</h1>

    <div class="welcome-text">
        <p>Welcome to our application! Please choose an option to continue:</p>
    </div>

    <div class="button-container">
        <!-- Login Button (GET /login) -->
        <a href="${pageContext.request.contextPath}/login" class="btn btn-login">
            🚀 Login
        </a>

        <!-- Register Button (GET /register) -->
        <a href="${pageContext.request.contextPath}/registration" class="btn btn-register">
            📝 Register
        </a>
    </div>
</div>

</body>
</html>