package com.telusko;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/filterServlet")
public class FilterServletExample extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int age = Integer.parseInt(req.getParameter("age"));
        String aname = req.getParameter("aname");

        PrintWriter out = resp.getWriter();
        if (age>=18)
            out.println("You are eligible ;-) "+aname);
        else
            out.println("Groww upp !! "+aname);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST reqo successo !! ");
    }
}
