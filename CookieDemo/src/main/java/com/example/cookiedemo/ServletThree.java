package com.example.cookiedemo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletThree", value = "/ServletThree")
public class ServletThree extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        Cookie [] cookies = request.getCookies();

        out.println("Username is : " + cookies[0].getValue());
        out.println("<br>");
        out.println("Age is : " + cookies[1].getValue());
        out.println("<br>");
        out.println("Qualification is : " + cookies[2].getValue());
        out.println("<br>");
        out.println("Designation is : " + cookies[3].getValue());
        out.println("<br>");
        out.println("Email is : " + email);
        out.println("<br>");
        out.println("Mobile number is : " + mobile);
    }
}