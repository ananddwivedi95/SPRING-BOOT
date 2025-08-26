<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Already Exists</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            margin-top: 100px;
        }
        h2 {
            color: red;
        }
        .btn {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #007BFF;
            border: none;
            border-radius: 5px;
            color: white;
            cursor: pointer;
            font-size: 16px;
        }
        .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<!-- Dynamic Gmail from ModelAndView -->
<h2>${gmail} user already exists!</h2>

<!-- Button will trigger GET /registration -->
<form action="<%=request.getContextPath()%>/registration" method="get">
    <button type="submit" class="btn">Try Again</button>
</form>

</body>
</html>
