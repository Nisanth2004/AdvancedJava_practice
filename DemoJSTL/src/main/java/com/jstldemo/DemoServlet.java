package com.jstldemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet
{
   protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {
	  Student s=new Student(1, "Nisanth");
	  
	   request.setAttribute("student", s);
	   RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
	   rd.forward(request, response);
	   }
}
