<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@page isELIgnored="false" %>   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
<%
	/* String name=(String)request.getAttribute("name");
	String mobile=(String)request.getAttribute("mobile");
	Integer id=(Integer)request.getAttribute("id");
	LocalDateTime time=(LocalDateTime)request.getAttribute("time");
	 */
%>
	<h1>
		Hello this is <%-- <%= name %> --%>
		${name }
	</h1>
	<h1>
		My mobile no is <%-- <%=mobile %> --%>
		${mobile }
	</h1>
	<h1>
		My Id is <%-- <%=id %> --%>
		${id }
	</h1>
	<h1>
		date and time is <%-- <%=time.toString() %> --%>
		${time }
	</h1>
	<hr>
	<c:forEach 
	var ="dost" items="${frnd }">
	<h1>${dost}</h1>
	</c:forEach>
	
	
	
	
	
	
	
	
</body>
</html>