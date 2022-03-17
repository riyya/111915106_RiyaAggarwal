package com.employee.signup;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SalaryDetails extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empid = request.getParameter("empid");
		String job = request.getParameter("job");
		String month = request.getParameter("month");
		String bonus = request.getParameter("bonus");
		
		
		InsertSal obj = new InsertSal();
		if(obj.insert(empid, job, month, bonus)) {
			response.sendRedirect("EmployeeLogin.jsp");
		}
		else {
			response.sendRedirect("Failure.jsp");
		}
	}

}
