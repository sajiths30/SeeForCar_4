<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cars</title>
</head>
<body>
<h2>Display Cars</h2>
<table border="1">
<tr>
<th>Car Number</th>
<th>Car Service</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Time</th>
</tr>
<c:forEach var="cars" items="${cars}">
<tr>
<td>${cars.carNumber}</td>
<td>${cars.carService}</td>
<td>${cars.departureCity}</td>
<td>${cars.arrivalCity}</td>
<td>${cars.estimatedDepartureTime}</td>
</tr>
</c:forEach>
</table>
</body>
</html>