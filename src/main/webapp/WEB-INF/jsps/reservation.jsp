<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Car Booking</title>
</head>
<body>
	<h2>Book your car</h2>
	<form action="saveBooking" method="post">
	<table>
	<tr>
	<td>Car Name:</td><td><input type="text"  name="carName" value="${car.name}"   /></td>
	</tr>
	<tr>
	<td>Charge/Day:</td><td><input type="text" name="chargePerKm" value="${car.chargePerKm}"   /></td>
	</tr>
	<tr>
	<td>Ac available:</td><td><input type="text"  name="AC" value="${car.ac}"   /></td>
	</tr>
	
	<tr>
	<td>Booking days:</td><td><input type="text" name="bookingPeriod" /></td>
	</tr>
	<tr>
	<td>PickUp date:</td><td><input type="date" name="pickUpDate" /></td>
	</tr>
	<tr>
	<td>Drop date:</td><td><input type="date" name="dropDate"/></td>
	</tr>
	<tr>
	<td>Customer Name:</td><td><input type="text" name="customerName" value="${user.firstName}"  /></td>
	</tr>
	<tr>
	<td>Customer email:</td><td><input type="email" name="customerEmail" value="${user.email}"  /></td>
	</tr>
	<tr>
	<td>Customer number:</td><td><input type="text" name="customernumber" value="${user.mobile}"  /></td>
	</tr>
	<tr>
	<td>Payment mode:</td>
	        <td>
	        <select name="source">
			<option value="Upi">Upi payment</option>
			<option value="Card">Card payment</option>
			<option value="Cash">Cash payment</option>
			
		</select>
		</td>
	</tr>
	<tr>
	<td><input type="hidden" name="user" value="${user.username}"/></td>
	</tr>
	<tr>
	<td><input type="submit" value="submit" /></td>
	</tr>
	</table>
	</form>
</body>
</html>