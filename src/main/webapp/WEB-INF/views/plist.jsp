<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>All Phones</title>
</head>
<body>

	<h1>Listing all Phones</h1>


	<c:forEach items="${phones}" var="phone">

		<c:out value="${phone.name}" />

		<c:out value="${phone.id}" />

		<c:out value="${phone.storageSize}" />
		<br>

	</c:forEach>

</body>
</html>