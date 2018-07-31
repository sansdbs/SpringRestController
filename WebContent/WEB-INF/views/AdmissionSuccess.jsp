<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


</head>
<body>

	<table>
		<tr>
			<td>Employee Id</td>
			<td>${emp.empId}</td>
		</tr>

		<tr>
			<td>Employee Name</td>
			<td>${emp.empName}</td>
		</tr>

		<tr>
			<td>Employee City</td>
			<td>${emp.empCity}</td>
		</tr>

		<tr>
			<td>Employee Mobile</td>
			<td>${emp.empMobile}</td>
		</tr>

		<tr>
			<td>Employee Hobbies:</td>
			<td>${emp.empHobby}</td>
		</tr>
	</table>

	<table>
		<tr>
			<td>Address:</td>
			<td>${emp.empAddress.flatNo},</td>
			<td>${emp.empAddress.roadName},</td>
			<td>${emp.empAddress.landmark},</td>
			<td>${emp.empAddress.pincode}.</td>
		</tr>
	</table>


</body>
</html>