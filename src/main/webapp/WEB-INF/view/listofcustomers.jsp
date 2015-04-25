<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hello,this is the list of Customers</h1>
	<table>
	<tr>
		<td>cname</td>
		<td>telcode</td>
		<td>address</td>
		<td>department</td>
		<td>poscode</td>
		<td>regioncode</td>
	</tr>
	<c:forEach var="customer" items="${customers}">
	<tr>
		<td>${customer.cname}</td>
		<td>${customer.telcode}</td>
		<td>${customer.address}</td>
		<td>${customer.department}</td>
		<td>${customer.poscode}</td>
		<td>${customer.regioncode}</td>
	</tr>
	</c:forEach>
	</table>
</body>
</html>