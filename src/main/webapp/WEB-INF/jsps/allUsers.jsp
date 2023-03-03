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
		<h1>List of Customers</h1>
		<br>
		<hr>

		<table>
			<tr>
				<th>firstName &nbsp</th>
				<th>lastName &nbsp</th>
				<th>email &nbsp</th>
				<th>mobile &nbsp</th>
				<th>address &nbsp</th>
				<th>username &nbsp</th>
				<th>update &nbsp</th>
				<th>delete &nbsp</th>
				<th>Block user</th>
				<th><form action="addNewUser" method="post">
				<input type="submit" value="add new user"/>
				</form></th>
			</tr>

			<c:forEach var="users" items="${users}">
				<tr>
					<td>${users.firstName}</td>
					<td>${users.lastName}</td>
					<td>${users.email}</td>
					<td>${users.mobile}</td>
					<td>${users.address}</td>
					<td>${users.username }</td>
					<td><a href="update?uName=${users.username}">update</a></td>
					<td><a href="delete?email=${users.email}">delete</a></td>
					<td><a href="blockUser?block=${users.username}">block</a></td>
					<td></td>

				</tr>

			</c:forEach>
		</table>
	</center>

</body>
</html>