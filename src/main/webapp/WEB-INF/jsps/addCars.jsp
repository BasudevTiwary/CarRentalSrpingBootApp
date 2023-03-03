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
		<h1>Add Car</h1>
		<br> <br>
		<hr>
		<form action="saveCar" method="post">
			Car Name <input type="text" name="name" /> 
			chargePerDay <input type="text" name="chargePerKm" />
			 Ac avaiable <input type="text" name="Ac" /> 
			 <input type="submit" value="submit"/>

		</form>
	</center>
</body>
</html>