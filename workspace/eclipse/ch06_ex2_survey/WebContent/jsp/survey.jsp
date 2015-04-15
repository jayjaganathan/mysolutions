<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="../styles/main.css">
<title>Insert title here</title>
</head>
<body>
<h3>Thanks for taking our survey.</h3>

Here is the information you entered:

<table>

<tr>

<td>Email: </td><td>${user.email}</td></tr>
<tr><td>First Name: </td><td>${user.firstName}</td></tr>
<tr><td>Last Name: </td><td>${user.lastName}</td></tr>
<tr><td>Heard From: </td><td>${user.heardFrom}</td></tr>
<tr><td>Updates: </td><td>${user.wantsUpdates}</td></tr>

<c:if test='${user.wantsUpdates == "Yes"}'>
	<tr><td>Contact Via: </td><td>${user.contactVia}</td>
</tr>
</c:if>

</table>
${user.wantsUpdates == "Yes"}

<c:forEach var='c' items='${cookie}'>
	${c.value.name}: ${c.value.value}<br/>
</c:forEach>
</body>
</html>