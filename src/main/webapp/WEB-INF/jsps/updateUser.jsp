<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Update User</h1>
	<br>
	<hr>
	<form action="updateUser" method="post">
	 first name <input type="text" name="firstName" value="${customer.firstName}"/>
	 last name <input type="text" name="lastName" value="${customer.lastName}"/>
	 email <input type="email" name="email" value="${customer.email}"/>
	 mobile<input type="number" name="mobile" />
	 address<input type="text" name="address" />
	 <br>
	 <br>
	 <input type="submit" value="submit">
	</form>
</body>
</html>