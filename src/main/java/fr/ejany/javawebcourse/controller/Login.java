package fr.ejany.javawebcourse.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name = "login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    private static final String DASHBOARD_JSP_VIEW = "/welcome.jsp";

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("user");
        String pass = req.getParameter("pass");

        getServletContext().setAttribute("name",name);

        if(name.equals("bernard") && pass.equals("pass")) {
            //resp.sendRedirect( "welcome.jsp?name="+name);

            req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        }else{
            //resp.sendRedirect("index.jsp");

            req.getRequestDispatcher("index.jsp").forward(req, resp);


        }
    }


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
