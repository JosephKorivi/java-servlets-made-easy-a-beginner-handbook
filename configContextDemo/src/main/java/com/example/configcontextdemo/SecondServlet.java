package com.example.configcontextdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", value = "/SecondServlet")
public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("*********************************************************************** <br><br>");
        ServletConfig config = getServletConfig();
        String shirt = config.getInitParameter("Shirt");
        String shoes = config.getInitParameter("Shoes");
        out.println("Shirt Cost is : " + shirt + "<br>" + "Shoes Cost is : " + shoes);
        out.println("<br> *********************************************************************** <br>");
        ServletContext context = config.getServletContext();
        String user = context.getInitParameter("username");
        String pass = context.getInitParameter("password");
        out.println("Username is : " + user + "<br>" + "Password is : " + pass);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
