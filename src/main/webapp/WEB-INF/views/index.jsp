<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>this is home page</h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>
	
	<%
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		String mobile=(String)request.getAttribute("mobile");
		List<String>friends=(List<String>)request.getAttribute("f");
	%>
	<h1>Name is <%=name %></h1>
	<h1>Id is <%=id %></h1>
	<h1>Mobile is <%=mobile %></h1>
	<h1><%
		for(String s:friends){
		out.println(s);
		}
	%></h1>
	
	
</body>
</html>