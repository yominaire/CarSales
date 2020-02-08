<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BEST DEAL MOTORS</title>
</head>
<body>
<form action = "carServlet" method="post">
<label>Make</label>
	<div>
	<input type="text" name="make">
	</div>
	<br>
	<label>Mileage</label>
	<input type="text" name="mileage">
	<div>
	<br>
		<label>Price</label>
	<input type="text" name="Price">
	</div>
	<br>
	<label>Year</label>
	<input type="text" name="Year">
	<div>
	<br>
	<button type="submit"> SUBMIT</button>
	</form>
</body>
</html>