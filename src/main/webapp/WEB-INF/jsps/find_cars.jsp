<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Cars</title>
</head>
<body>
<h2>Find Your Car</h2>
<form action="findcars" method="post">
<pre>
From:<input type="text" name="from"/>
To:<input type="text" name="to"/>
Departure Date:<input type="text" name="departureDate"/>
<input type="submit" value="Search">
</pre>
</form>
</body>
</html>