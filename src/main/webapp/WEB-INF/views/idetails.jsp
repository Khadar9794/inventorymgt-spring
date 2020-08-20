<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Details</title>
</head>
<body>

<h1>Item Details </h1>

name is <c:out value="${item.name}"  />
<br>

id is <c:out value="${item.id}"  />
<br>

</body>
</html>
