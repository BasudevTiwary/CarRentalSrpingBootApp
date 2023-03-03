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
		<h2>hello ${username} please see the details of your booking</h2>
	</center>

	<br>
	<hr>
	<center>
		<form action="confirmation" method="post">
			<table>
				<tr>
					<td>Customer name: </td>
					<td><input type="text" value="${status.customerName}" disabled/></td>
				</tr>
				<tr>
					<td>Customer email:</td>
					<td><input type="text" value="${status.customerEmail}" disabled/></td>
				</tr>
				<tr>
					<td>Customer number:</td>
					<td><input type="text" value="${status.customernumber}" disabled/></td>
				</tr>
				<tr>
					<td>Car Name:</td>
					<td><input type="text" value="${status.carName}" disabled/></td>
				</tr>
				<tr>
					<td>Charge/day:</td>
					<td><input type="text" value="${status.chargePerKm}" disabled/></td>
				</tr>
				<tr>
					<td>Ac available:</td>
					<td><input type="text" value="${status.AC}" disabled/></td>
				</tr>
				<tr>
					<td>Booking days: </td>
					<td><input type="text" value="${status.bookingPeriod}" disabled/></td>
				</tr>
				<tr>
					<td>PickUp date:</td>
					<td><input type="text" value="${status.pickUpDate}" disabled/></td>
				</tr>
				<tr>
					<td>Drop date :</td>
					<td><input type="text" value="${status.dropDate}" disabled/></td>
				</tr>
				<tr>
					<td>Payment mode:</td>
					<td><input type="text" value="${status.source}" disabled/></td>
				</tr>
				<tr>
					<td><h3>total amount:</h3></td>
					<td><h3><input type="text" value="${fair}" disabled/></h3></td>
				</tr>
				<tr>
				<td><input type="hidden" value="${status.customerName}" name="username"/></td>
				</tr>
				<tr>
					
					<td><input type="submit" value="click to book"/></td>
				</tr>

			</table>
			
		</form>
	</center>
</body>
</html>