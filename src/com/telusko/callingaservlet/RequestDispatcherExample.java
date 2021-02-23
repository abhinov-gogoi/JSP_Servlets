package com.telusko.callingaservlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

// www.youtube.com/watch?v=kYzyXWmh37A&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=11
public class RequestDispatcherExample extends HttpServlet {

    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // I can forward the attribute to another servlet, "/square" in this case
        // int k = Integer.parseInt(req.getParameter("num"));
        // req.setAttribute("number_to_square", k);
        // and then forward the req object

        // or I can dispatch and forward the req and resp objects directly to "/square" (see in web.xml file)
        RequestDispatcher dispatcher = req.getRequestDispatcher("square");
        dispatcher.forward(req, resp);
    }

}
