<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Admin Register</h1>
	<br>
	<hr>
	<form action="saveAdmin" method="post">
	 first name <input type="text" name="firstName"/>
	 last name <input type="text" name="lastName"/>
	 email <input type="email" name="email"/>
	 address<input type="text" name="address"/>
	 <br>
	 <br>
	 admin name<input type="text" name="adminName"/>
	 password<input type="text" name="password"/>
	 <input type="submit" value="submit">
	</form>

</body>
</html>