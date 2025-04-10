package com.example.cookiedemo;

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
        Cookie cookie = new Cookie("username", username);
        Cookie cookie2 = new Cookie("age", age);
        response.addCookie(cookie);
        response.addCookie(cookie2);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Form2.html");
        dispatcher.forward(request, response);
    }
}