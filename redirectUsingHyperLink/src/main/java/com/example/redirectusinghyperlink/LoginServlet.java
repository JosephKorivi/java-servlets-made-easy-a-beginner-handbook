package com.example.redirectusinghyperlink;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("abc") && password.equals("abc")) {
//            out.println("<a href='https://josephkorivi.blogspot.com/'>Click Here..</a>");
            response.sendRedirect("https://josephkorivi.blogspot.com");
        } else {
            response.sendError(880, "Opps!... Invalid Credentials...!");
        }
    }
}
