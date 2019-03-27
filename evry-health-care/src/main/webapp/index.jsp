<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hospital Management System</title>
</head>
<body style="background-color:powderblue;">
	<h1 align="center">Hospital Managemnet System</h1>
	<form action="./AppointmentController" method="get">
	<table align="center">
		<tr><th>Patient Id: </th><td><input type="text" name="pid" /></td></tr>
		<tr><th>Patient Name : </th><td><input type="text" name="name"/></td></tr>
		<tr><th>Age : </th><td><input type="text" name="age"/></td></tr>
		<tr><th>Blood Group : </th><td><input type="text" name="bgroup"/></td></tr>
		<tr><th>Checkup : </th><td><input type="radio" name="checkup" value="ip" checked>IP<br/>
		 <input type="radio" name="checkup" value="Emergency">Emergency</td></tr>
		 <tr><th>Doctor :</th><td><select name="doctor">
		 	<option value="den">Dentists</option>
 			 <option value="car">Cardiologist</option>
 			 <option value="nur">Nurologist</option>
			</select></td></tr>
		<tr><th>Recommended Test :</th>
			<td><textarea name="test" rows="4" cols="30"/> </textarea><td></td></tr>
			<tr><td><input type="submit" value="submit"/></td>
			<td><input type="reset" value="reset"/></td></tr>
			</table>
	</form>
</body>
</html>