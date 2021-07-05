
package com.mycompany.jspprogram;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("description1"));
        int j = Integer.parseInt(req.getParameter("description2"));

        int k = i + j;

        PrintWriter out = res.getWriter();
        out.println("Result is: " + k);

    }


    
    
}
