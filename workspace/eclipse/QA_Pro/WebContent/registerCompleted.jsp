<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	You have registered successfully.
	
	<br/>
	<br/>
	<jsp:useBean id="bookBean" class="com.BookClass" scope="session">
		
	</jsp:useBean>
	<jsp:setProperty property="name" name="bookBean"/>
	
	Your name is <%= request.getParameter("name") %>	<br/>
	You name again is 
	<jsp:getProperty name="bookBean" property="name" />
	<br/>
	Your language is <%= request.getParameter("language") %>	<br/>
	<br/>
	You will write about
	<%
		for(String s : request.getParameterValues("topics"))
			out.println(s + " ");
	%>
</body>
</html>