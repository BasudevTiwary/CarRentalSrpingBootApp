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
		<h1>transaction Data Customer Boooking data</h1>
		<br> <br>
		<hr>
		<table>
			<tr>
				<td><h4>Customer Name &nbsp</h4></td>
				<td><h4>Car Name &nbsp</h4></td>
				<td><h4>BookingPeriod&nbsp</h4></td>
				<td><h4>ChargePer Day</h4></td>
				<td><h4>Amount paid</h4></td>
			</tr>
			<c:forEach var="transaction" items="${transaction}">
				<tr>
					<td>${transaction.customerName} &nbsp</td>
					<td>${transaction.carName}&nbsp</td>
					<td>${transaction.bookingPeriod}days &nbsp</td>
					<td>${transaction.chargePerKm}</td>
					
					<c:set var="totalamount" value="${transaction.bookingPeriod*transaction.chargePerKm}"></c:set>
				   <td> <c:out value="${totalamount}"></c:out></td>
				</tr>
				
			</c:forEach>

		</table>
	</center>
</body>
</html>