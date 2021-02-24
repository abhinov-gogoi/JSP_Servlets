<%--
  Created by IntelliJ IDEA.
  User: Abhinov
  Date: 24-02-2021
  Time: 03:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Error Example</title>
</head>
<body>
<h1>Error Example</h1>
<%
    int k =3/0; // this will give an error, which will be sent to errorPage (error.jsp)
%>
</body>
</html>
