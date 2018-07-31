<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<body>
<a href ="http://localhost:2002/SpringMvcAttribute/admissionForm.html?siteLanguage=en">ENGLISH</a> | <a href ="http://localhost:2002/SpringMvcAttribute/admissionForm.html?siteLanguage=fr">FRENCH</a>

	<h1>${headerMsg}</h1>

	<form:errors path="emp.*" />
	<form action="/SpringMvcAttribute/submitForm.html" method="post">
		<table>

			<tr>
				<td><spring:message code="label.empId" /></td>
				<td><input type="text" name="empId" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.empName" /></td>
				<td><input type="text" name="empName" /></td>
			</tr>

			<tr>
				<td><spring:message code="label.empCity" /></td>
				<td><input type="text" name="empCity"></td>
			</tr>

			<tr>
				<td><spring:message code="label.empMobile" /></td>
				<td><input type="text" name="empMobile"></td>
			</tr>

		</table>
		<table>
			<tr>
				<td><spring:message code="label.empHobby" /></td>
				<td><select name="empHobby" multiple>
						<option value="Cricket">Cricket</option>
						<option value="Travel">Travel</option>
						<option value="Chess">Chess</option>
						<option value="Reading">Reading</option>

				</select></td>
			</tr>
		</table>

		<table>
			<tr>
				<td>EmpAddress</td>
			</tr>

			<td><spring:message code="label.flatNo" /><input type="text"
				name="empAddress.flatNo"></td>
			<td><spring:message code="label.roadName" /><input type="text"
				name="empAddress.roadName"></td>
			<td><spring:message code="label.landmark" /><input type="text"
				name="empAddress.landmark"></td>
			<td><spring:message code="label.pincode" /><input type="text"
				name="empAddress.pincode"></td>

		</table>

		<input type="submit" value="submit" />

	</form>


</body>
</html>