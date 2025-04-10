package com.example.configcontextdemo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("**************************************");
        out.println("<br><br>");
        ServletConfig config = getServletConfig();
        String pen = config.getInitParameter("Pen");
        String book = config.getInitParameter("Book");
        out.println("Price of Pen is : " + pen + "<br>" + "Price of Book is : " + book + " <br>");
        out.println("***************************************");

        ServletContext context = config.getServletContext();
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");
        out.println("<br> " + "UserName is : " + username + " <br>" + "Password is : " + password + " <br>");
        out.println("****************************************");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
