<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generation of E Card</title>
<script type="text/javascript" src="GeneratingECardValidation.js"></script>
</head>
<body>

	<h1 align="center">Generation of E Card</h1>
	<form action="GeneratingECard" name="myForm"
		onsubmit="return validate()">
		<div align="center">
			<table>
				<tr>
					<td><label for="gender"><h2>Select:</h2> </label>
					<td><input type="radio" id="gender" name="E-Card"
						value="Employee E-Card" checked />Employee E-Card <br /></td>

					<td><input type="radio" id="gender" name="E-Card"
						value="Dependent E-Card" />Dependent E-Card<br /></td>
				</tr>

			</table>

			<label for="HealthInsuranceID">Enter Health Insurance ID: </label> <input
				type="text" name="HealthInsuranceID"> <font color="red">
				<div id="HealthInsuranceID"></div>
			</font><br> <br> <input type="submit" name="Generate E-Card"
				value="Generate E-Card"> <input type="reset" name="Reset"
				value="Reset">

		</div>
	</form>
</body>
</html>