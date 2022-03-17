<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/riyaaggarwal_111915106";
	String username="root";
	String password = "8156@riya";
	String sql ="select * from Riya_Aggarwal_111915106_details";
	try {
		Class.forName(driver);
	} 
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Records</title>
</head>
<body>

<h1>Displaying Employee Data</h1>
	<table border="2">
	<tr>
		<td>Employee ID</td>
		<td>First name</td>
		<td>Last name</td>
		<td>Date of Birth</td>
		<td>Contact Number</td>
	
	</tr>
<%
	try{
		connection = DriverManager.getConnection(url, username, password);
		statement=connection.createStatement();
		resultSet = statement.executeQuery(sql);
		while(resultSet.next()) {
%>
	<tr>
		<td><%=resultSet.getString("Employee_ID_Number") %></td>
		<td><%=resultSet.getString("First_Name") %></td>
		<td><%=resultSet.getString("Last_Name") %></td>
		<td><%=resultSet.getString("Date_of_Birth") %></td>
		<td><%=resultSet.getString("Contact_Number") %></td>
		
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

	<form action="DispSalary.jsp" method="post">
		 Enter Employee ID : <input type="text" name="empid"><br>
		 <input type="submit" value="Get Details">
	</form>
</body>
</html>