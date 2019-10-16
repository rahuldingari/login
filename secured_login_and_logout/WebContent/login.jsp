<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/Login" method="post">
		Enter Your User_name:<input type="text" name="userid"/> <br>
		EnterPassword:<input type="text" name="userpass"/> <br>
		<input type="submit" value="Login"/>
	</form>
	<a href="intro.jsp">intoduction</a>
</body>
</html>