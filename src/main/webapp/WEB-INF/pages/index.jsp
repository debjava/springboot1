<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Welcome to the World of Spring Boot</h2>
	<h2>Message From Server : ${message}</h2>

	<a href="login"> Login </a>
	
	<p>
	
	<c:url value="/login" var="url"/>
 <a href="<c:out value='${url}'/>">..Login..</a>
	
</body>
</html>
