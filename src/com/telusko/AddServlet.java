package com.telusko;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    public void service (HttpServletRequest req, HttpServletResponse res) throws IOException {

        int x =  Integer.parseInt(req.getParameter("num1"));
        int y =  Integer.parseInt(req.getParameter("num2"));
        int z = x+y;
        System.out.println("Result is = "+z);

        PrintWriter output = res.getWriter();
        output.println("result is "+z);
    }
}
