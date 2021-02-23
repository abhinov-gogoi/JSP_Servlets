package com.telusko.callingaservlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {

    protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int sq = Integer.parseInt(req.getParameter("num"));

        PrintWriter out = resp.getWriter();
        out.println("this is from SquareServlet. The result is "+(sq*sq));
    }
}
