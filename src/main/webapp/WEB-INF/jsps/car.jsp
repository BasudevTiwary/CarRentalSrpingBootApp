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
	<center>
		<h1>List of cars</h1>
		<br>
		<hr>

		<table>
			<tr>
				<th>car name&nbsp</th>
				<th>charge/day &nbsp</th>
				<th>ac available&nbsp</th>
				<th>book now&nbsp</th>
				
			</tr>

			<c:forEach var="cardeatils" items="${cardeatils}">
				<tr>
					<td>${cardeatils.name}</td>
					<td>${cardeatils.chargePerKm} </td>
					<td>${cardeatils.ac}</td>
					<td><a href="carBooking?id=${cardeatils.id}&username=${username}">book now</a></td>

				</tr>
		
			</c:forEach>
		</table>
	</center>

</body>
</html>