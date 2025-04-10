package com.example.reqinclude;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String user = request.getParameter("username");
        String pass = request.getParameter("pass");

        if (user.equals("abc") && pass.equals("abc")) {
            RequestDispatcher rd = request.getRequestDispatcher("/SuccessServlet");
            rd.forward(request, response);
        } else {
            out.println("Oops!.. Invalid Credentials Entered");
            RequestDispatcher rd = request.getRequestDispatcher("/Login.html");
            rd.include(request, response);
        }
    }
}
