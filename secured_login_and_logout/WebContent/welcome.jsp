<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("username")==null)
{
response.sendRedirect("Login.java");
}

%>
Welcome :${username}
	<a href="videos.jsp">Videos</a>
	<br>
    <form action="Logout">
    <input type="submit" value="logout">
    </form>


</body>
</html>