<%--
  Created by IntelliJ IDEA.
  User: Abhinov
  Date: 24-02-2021
  Time: 02:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tags in JSP</title>
</head>
<body>
    <h1>Tags in JSP</h1>

    JSP does same things as Servlets ie combine HTML and Java code<br>
    In Servlets we write HTML code inside JAVA code.<br>
    In JSP we write JAVA code inside HTML code.<br>

    JSP tags - Declaration, Directive, Scriptlets, Expression<br><br>

    <h2>Directive tag</h2>
    &lt;%@<br>
    &nbsp;&nbsp;&nbsp;// Code inside directive tag is for imports<br>
    %&gt;<br>

    <h2>Declaration tag</h2>
    &lt;%!<br>
    &nbsp;&nbsp;&nbsp;// Code inside declaration tag lies OUTSIDE the service() method<br>
    &nbsp;&nbsp;&nbsp;// They become instance fields/methods and have Class level scope<br>
    %&gt;<br>

    <h2>Scriptlets tag</h2>
    &lt;%<br>
    &nbsp;&nbsp;&nbsp;// Code inside scriptlets tag becomes code inside service() method<br>
    %&gt;<br><br>

    <h2>Expression tag</h2>
    &lt;%=<br>
    &nbsp;&nbsp;&nbsp;// Expresion - this tag can access members of JAVA code within JSP tags<br>
    &nbsp;&nbsp;&nbsp;// Code/fields inside expresion tag becomes code inside out.println("  ")<br>
    %&gt;<br><br>

</body>
</html>
