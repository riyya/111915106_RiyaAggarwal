package com.employee.signup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertSal {
		String sql="insert into riya_aggarwal_111915106_salaryy (Employee_ID_Number, Job_Role ,Monthly_Salary, Yearly_Bonus)"+" values (?,?,?,?)";
		String url = "jdbc:mysql://localhost:3306/riyaaggarwal_111915106";
		String username="root";
		String password = "8156@riya";
		public boolean insert(String empid, String job, String month, String bonus) {
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
	    	}
	    	catch(Exception e) {
	    		System.out.println(e);
	    	}
	    	try {
	    		Connection con=DriverManager.getConnection(url,username,password);
	    		PreparedStatement st= con.prepareStatement(sql);
	    		st.setString (1, empid);
	    		st.setString (2, job);
	    		st.setString (3, month);
	    		st.setString (4, bonus);
	    		
	    		st.execute();
	      
	      con.close();
	      return true;
	    }
	    catch (Exception e)
	    {
	      System.err.println(e.getMessage());
	      return false;
	    }
	}
}
