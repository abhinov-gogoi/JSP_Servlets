<%@ page import="java.io.PrintWriter" %>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
    <title>Add JSP</title>
</head>
<body>
<h1>Add.jsp</h1>
It does te exact same thing as AddServlet class. JSPs get converted to servlets on execution<br>
This Add.jsp file will be converted to Add_jsp.class servlet <br>
Automatically it will extend HttpServlet class and implement service() method. <br>

<%--Note that I am action button is calling Add.jsp directly, No need of putting into web.xml file --%>
<h2>Add two Numbers<br></h2>
<form action = "Add.jsp">
    Enter 1st number : <input type="number" name="num1">
    Enter 2nd number : <input type="number" name="num2">
    <input type="submit">
</form>

<%--Directive tag--%>
<%@
        page import="java.util.Scanner"
%>

<%--Declaration tag - code inside this tag has class level scope--%>
<%!
    Scanner scanner = new Scanner(System.in);
    int fav_no = 3;
%>

<%--Scriplet tag  - code within this tag goes into the service() method--%>


<%
    int x =  Integer.parseInt(request.getParameter("num1"));
    int y =  Integer.parseInt(request.getParameter("num2"));
    int z = x+y;
    System.out.println("Result is = "+z);
    PrintWriter output = response.getWriter();
    output.println("result is "+z);
%>

<%--Expresion - this tag can access members of JAVA code within JSP tags--%>
My Favourite number is: <%= fav_no%>
<br>
Result output is : <%= z %>

</body>
</html>
