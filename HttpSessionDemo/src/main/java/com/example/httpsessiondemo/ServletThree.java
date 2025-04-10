package com.example.httpsessiondemo;

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

        HttpSession session = request.getSession();
        out.println("User Name is : " + session.getAttribute("username"));
        out.println("<br>");
        out.println("User age is : " + session.getAttribute("age"));
        out.println("<br>");
        out.println("User Qualification is : " + session.getAttribute("qualification"));
        out.println("<br>");
        out.println("User Designation is : " + session.getAttribute("designation"));
        out.println("<br>");
        out.println("User email is : " + email);
        out.println("<br>");
        out.println("User mobile is : " + mobile);

    }
}