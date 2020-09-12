<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
	<td>Athlete ID</td>
	<td>Athlete Name</td>
	<td>Gender</td>
	<td>Category</td>
	<td>Email</td>
	<td>Number</td>
</tr>
<c:forEach var= "user" items="${ listPlayer}">

	
	<tr>
		<td>${user.athleteID }</td>
		<td>${user.athleteName }</td>
		<td>${user.gender}</td>
		<td>${user.category }</td>
		<td>${user.email }</td>
		<td>${user.number }</td>
	</tr>
</c:forEach>
</table>
</body>
</html>