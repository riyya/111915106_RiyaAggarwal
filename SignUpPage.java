package com.employee.signup;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SignUpPage extends HttpServlet {
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String dob = request.getParameter("dob");
		String phone = request.getParameter("phone");
		String pass = request.getParameter("pass");
		
		EmpSignup obj = new EmpSignup();
		if(obj.insert(empid, first, last, dob, phone, pass)) {
			response.sendRedirect("Salary.jsp");
		}
		else {
			response.sendRedirect("Failure.jsp");
		}
	}

}
