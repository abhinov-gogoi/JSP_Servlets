<%--
  Created by IntelliJ IDEA.
  User: Abhinov
  Date: 24-02-2021
  Time: 03:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>Error Page</title>
</head>
<body bgcolor="#8b0000">
<h1>***********    ERROR    ***********</h1>
<%= exception%> <br>
<%= exception.getMessage() %> <br>
<%= exception.getStackTrace() %> <br>

</body>
</html>
