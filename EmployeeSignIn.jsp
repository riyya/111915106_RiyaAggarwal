<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee SignUp</title>
</head>
<body>
	<form action="SignUpPage" method="post">
		Enter EmployeeID : <input type="text" name="empid"><br><br>
		Enter First Name : <input type="text" name="first"><br><br>
		Enter Last Name : <input type="text" name="last"><br><br>
		Enter Date of Birth : <input type="text" name="dob"><br><br>
		Enter Contact Number : <input type="text" name="phone"><br><br>
		Enter Password : <input type="password" name="pass"><br><br>
		<input type="submit" value="Sign Up">
	</form>
</body>
</html>