package com.telusko;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DoGetDoPost extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter output = resp.getWriter();
        output.println("Access denieeed USER !! Cant change the HTML tag to \"get\" just like that");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int x =  Integer.parseInt(req.getParameter("num1"));
        int y =  Integer.parseInt(req.getParameter("num2"));
        int z = x+y;
        System.out.println("Result is = "+z);

        PrintWriter output = resp.getWriter();
        output.println("result is "+z);
    }
}
