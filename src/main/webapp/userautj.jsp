<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/15/2024
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="UserServlet" method="post">
        Please enter your username
        <input type="text" name="un"/><br>

        Please enter your password
        <input type="text" name="pw"/>

        <input type="submit" value="submit">
    </form>
</body>
</html>
