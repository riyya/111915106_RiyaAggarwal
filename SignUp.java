package com.employee.signup;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.employee.signup.dao.EmployeeDAO;

public class SignUp extends HttpServlet {
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String empID = request.getParameter("empID");
//		String first = request.getParameter("firstName");
//		String last = request.getParameter("lastName");
//		String dob = request.getParameter("dob");
//		String phone = request.getParameter("phone");
//		String pass = request.getParameter("pass");
		
		EmployeeDAO db = new EmployeeDAO();
//		
//		
//		if(db.check(empID, pass)) {
//			HttpSession session = request.getSession();
//			session.setAttribute("empID", empID);
//			session.setAttribute("firstName", first);
//			session.setAttribute("lastName", last);
//			session.setAttribute("dob", dob);
//			session.setAttribute("phone", phone);
//			
//			response.sendRedirect("Report.jsp");
//		}
//		else {
//			response.sendRedirect("Failure.jsp");
//		}
	}

	

}
