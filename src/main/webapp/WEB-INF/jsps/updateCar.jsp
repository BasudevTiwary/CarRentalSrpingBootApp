<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Update Car</h1>
		<br>
		<br>
		<hr>
		<form action="updateOneCar" method="post">
		
		Car Name <input type="text" name="name" value="${car.name}"/>
		ChargePerDay <input type="text" name="chargePerKm" value="${car.chargePerKm}"/>
		Ac avaiable <input type="text" name="Ac"/>
		<input type="hidden" name="id" value="${car.id}"/>
		<input type="submit" value="update"/>
		</form>
	</center>
</body>
</html>