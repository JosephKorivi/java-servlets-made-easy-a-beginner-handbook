package com.example.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet3", value = "/LoginServlet3")
public class LoginServlet3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Hello... <br><br>");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        if (user.equals("seema") && pass.equals("seema")) {
            out.println("Login Successful");
        } else {
            out.println("Login Unsuccessful");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
