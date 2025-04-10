package com.example.httpsessiondemo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(name = "ServletTwo", value = "/ServletTwo")
public class ServletTwo extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String qualification = request.getParameter("qualification");
        String designation = request.getParameter("designation");

        HttpSession session = request.getSession(false);
        session.setAttribute("qualification", qualification);
        session.setAttribute("designation", designation);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Form3.html");
        dispatcher.forward(request, response);

    }
}