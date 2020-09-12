<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 
<form action="playerAdded" method="post">
	Athlete Name :<input type= "text" name="athleteName"><br>
	Gender : <input type="radio" name="gender" value="male" id= "male">
				<label for="male">Male</label>
			<input type="radio" name="gender" value="female" id= "female">
				<label for="female">Female</label>
			<br>
	Category : <select name="category">
					<option> Running</option>
					<option> High Jump</option>
					<option>Hurdles</option>
					<option>Relay</option>
					<option>Javelin Throw</option>
					<option>Shot put</option>
			   </select>
			   <br>
	Email : <input type="email" name="email"></input><br>
	Mobile : <input type="number" name="number"></input> <br>
	
	<input type="submit" value="ADD">  <input type="submit" value="CANCEL"> <a href="">Home</a>
			
	
	
</form>

 -->

<table border="1">
<form action="playerAdded" method="post">
	
	<tr>
		<td>Athlete Name</td>
		<td><input type= "text" name="athleteName"></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><input type="radio" name="gender" value="male" id= "male">
				<label for="male">Male</label>
			<input type="radio" name="gender" value="female" id= "female">
				<label for="female">Female</label></td>
	</tr>
	<tr>
		<td>Category</td>
		<td><select name="category">
					<option> Running</option>
					<option> High Jump</option>
					<option>Hurdles</option>
					<option>Relay</option>
					<option>Javelin Throw</option>
					<option>Shot put</option>
			   </select><br></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><input type="email" name="email"></input></td>
	</tr>
	<tr>
		<td>Mobile</td>
		<td><input type="number" name="number"></input></td>
	</tr>
	<tr>
		<td><input type="submit" value="ADD">  <a href=""> <input type="button" value="CANCEL"> </a></td>
		<td> <a href="">Home</a></td>
	</tr>
	
			
	
	
</form>
</table>
</body>
</html>