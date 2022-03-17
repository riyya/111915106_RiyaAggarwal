package com.employee.signup;

import java.sql.*;
public class EmpSignup
{

	String sql="Insert into Riya_Aggarwal_111915106_details (Employee_ID_Number, First_Name, Last_Name, Date_of_Birth, Contact_Number, Password)" +" values (?,?,?,?,?,?)";
	String url = "jdbc:mysql://localhost:3306/riyaaggarwal_111915106";
	String username="root";
	String password = "8156@riya";
	public boolean insert(String empid, String first, String last, String dob, String phone, String pass) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("Driver loaded");
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	try {
    		Connection con=DriverManager.getConnection(url,username,password);
    		System.out.println("connection estab");
    		PreparedStatement st= con.prepareStatement(sql);
    		st.setString (1, empid);
    		st.setString (2, first);
    		st.setString (3, last);
    		st.setString (4, dob);
    		st.setString (5, phone);
    		st.setString (6, pass);
    	    
    		st.execute();
      
      con.close();
      return true;
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
      return false;
    }
  }
}