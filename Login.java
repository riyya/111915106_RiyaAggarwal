package com.employee.signup.login;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.employee.signup.dao.EmployeeDAO;

public class Login extends HttpServlet {
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String empID = request.getParameter("empid");
		String pass = request.getParameter("pass");
		
		EmployeeDAO db = new EmployeeDAO();
		
		
		if(db.check(empID, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("empid", empID);
			response.sendRedirect("Report.jsp");
		}
		else {
			response.sendRedirect("Failure.jsp");
		}
	}

	

}
