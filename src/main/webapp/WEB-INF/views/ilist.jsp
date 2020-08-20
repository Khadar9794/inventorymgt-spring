<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>All Items</title>
</head>
<body>


	<h1>Listing all items</h1>

	<c:forEach items="${items}" var="item">

		<c:out value="${item.name}" />
		
		<c:out value="${item.id}" />

		<br>
		
	</c:forEach>

</body>
</html>