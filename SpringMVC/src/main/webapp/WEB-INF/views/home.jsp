<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello home page
	JSTL not getting
	Stereotype
	<%-- <%
int id = (Integer)(request.getAttribute("id"));
String name = (String)request.getAttribute("name");
%>
<%out.print(id); %>
<%out.print(name); %> --%>
	<%-- <%
	int id = (Integer) (request.getAttribute("id"));
	String name = (String) request.getAttribute("name");
	%> --%>
	<h4>Id : ${id }</h4>
	<h4>Name : ${name }</h4>

</body>
</html>