<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Customer</h1>
	<br>
	<hr>
	<form action="addOneNewUser" method="post">
	 first name <input type="text" name="firstName"/>
	 last name <input type="text" name="lastName"/>
	 email <input type="email" name="email"/>
	 mobile<input type="number" name="mobile">
	 address<input type="text" name="address"/>
	 <br>
	 <br>
	 username<input type="text" name="username"/>
	 password<input type="text" name="password"/>
	 <input type="submit" value="submit">
	</form>
</body>
</html>