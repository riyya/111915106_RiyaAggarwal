<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<%
	String id = request.getParameter("empid");
	
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/riyaaggarwal_111915106";
	String username="root";
	String password = "8156@riya";
	String sql ="select * from riya_aggarwal_111915106_salaryy where Employee_ID_Number=?";
	
	try {
		Class.forName(driver);
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Salary Records</title>
</head>
<body>

<h1>Salary Details</h1>
	<table border="2">
	<tr>
		<td>Employee ID</td>
		<td>Job Role</td>
		<td>Monthly Salary</td>
		<td>Yearly Bonus</td>
	</tr>
<%
	try{
	connection = DriverManager.getConnection(url, username, password);
	statement= connection.prepareStatement(sql);
	statement.setString(1,id);
	resultSet = statement.executeQuery();
	while(resultSet.next()){
%>
<tr>
	<td><%=resultSet.getString("Employee_ID_Number") %></td>
	<td><%=resultSet.getString("Job_Role") %></td>
	<td><%=resultSet.getInt("Monthly_Salary") %></td>
	<td><%=resultSet.getInt("Yearly_Bonus") %></td>

</tr>
<%
}
	connection.close();
} 
catch (Exception e) {
	e.printStackTrace();
}
%>
</table> 
</body>
</html>