<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 3/15/2024
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        Page protected
        <%
            HttpSession session1 = request.getSession(false);
            String username = session1.getAttribute("username").toString();
            System.out.println( "Bonjour " + username );

        %>
    </h1>
    <form action="LogOutServlet">
        <button type="submit" >LogOut</button>
    </form>
</body>
</html>
