<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1> Admin Login</h1>
<br>
	<hr />
	<br />
	<form action="adminAuth" method="post">
	Admin name<input type="text" name="adminName"/>
	password<input type="text" name="password"/>
		 <input type="submit" value="submit"/>
	</form>
	<h3>${msg}</h3>
</body>
</html>