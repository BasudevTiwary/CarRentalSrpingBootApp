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
		<h1>All Booked Cars</h1>
		<br> <br>
		<hr>
		<table>
			<tr>
				<td>Car Name&nbsp</td>
				<td>chargePerDay&nbsp</td>
				<td>Ac avaiaable&nbsp</td>
			</tr>
			<c:forEach var="bookedCars" items="${bookedCars}">
			<tr>
			<td>${bookedCars.name}&nbsp</td>
			<td>${bookedCars.chargePerKm}&nbsp</td>
			<td>${bookedCars.ac}&nbsp</td>
			</tr>
			</c:forEach>
		</table>
	</center>
</body>
</html>