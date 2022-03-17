package com.employee.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDAO {
	String sql = "select * from Riya_Aggarwal_111915106_details where Employee_ID_Number=? and Password=?";
	String url = "jdbc:mysql://localhost:3306/riyaaggarwal_111915106";
	String username = "root";
	String password = "8156@riya";
	public boolean check(String empID, String pass) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1,  empID);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
}
