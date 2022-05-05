<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
               <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email Sending</title>
</head>
<body>
	<form action="compose" method="post">
	<pre>
	to<input type="text" name="to" value="${email}">
	subject<input type="text" name="subject"/>
	<textarea name="text" rows="8" cols="70">
	</textarea>
	<input type="submit" value="Send Mail"/>
	</pre>
	</form>
	${msg}
</body>
</html>