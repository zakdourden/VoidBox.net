package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import ejb.AccountBean;
import entity.Account;

@WebServlet("/servlet/login")
public class LoginServlet extends HttpServlet {
          private static final long serialVersionUID = 1L;
 
          @Context
          private HttpServletRequest request;

          @EJB
          private AccountBean bean;
          
          public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   String username = request.getParameter("username");
                   String password = request.getParameter("password");
    
                   
                   try {
                        	 request.login(username, password);
                              // replace with my db
                             List<Account>	 List = bean.findAll(false);
                             response.sendRedirect("/Voidnet/app/homePage.html");
                             int x = 5;
                   }
                   
                   catch(Exception e) {
                             // TODO:
                             PrintWriter out = response.getWriter();
                             out.println("Login Failed. " + e.getMessage());
                             //response.sendRedirect("/VoidNet/app/login.html");
                             return;
                   }
          }
 
          /**
          * Starting point(s).
          */
          public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   execute(request, response);
          }

          public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                   execute(request, response);
          }
}
