package com.telusko.callingaservlet;


//www.youtube.com/watch?v=2HurrgxlTmg&list=PLsyeobzWxl7pUPF2xjjJiG4BKC9x_GY46&index=12
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SendRedirect extends HttpServlet {
    @Override
    protected void service (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // PrintWriter out = resp.getWriter();
        // out.println("This is from Send Redirect");

        int k = Integer.parseInt(req.getParameter("num"));
        resp.sendRedirect("/square?num="+k);
    }
}
