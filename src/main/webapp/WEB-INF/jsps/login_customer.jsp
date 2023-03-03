<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>	
<body>

<h1>Login</h1>
<br>
	<hr />
	<br />
	<form action="login" method="post">
	username<input type="text" name="username"/>
	password<input type="text" name="password"/>
		 <input type="submit" value="submit"/>
	</form>
	<h4>${msg}</h4>

</body>
</html>