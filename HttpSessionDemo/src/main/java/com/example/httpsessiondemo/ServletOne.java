package com.example.httpsessiondemo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(name = "ServletOne", value = "/ServletOne")
public class ServletOne extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String age = request.getParameter("age");

        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("age", age);

        RequestDispatcher dispatcher = request.getRequestDispatcher("Form2.html");
        dispatcher.forward(request, response);
    }
}