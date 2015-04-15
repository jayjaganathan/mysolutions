<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="snapshot" driver="oracle.jdbc.OracleDriver"
     url="jdbc:oracle:thin:@127.0.0.1:1521:orcldb1"
     user="hr"  password="oracle"/>
 
<sql:query dataSource="${snapshot}" var="result">
	SELECT * from DEMO_CUSTOMERS  
</sql:query>

<c:out value='${"Hello\\\" World" == "Hello World"}'/>
    <form method="post" action="RegisterMember">
    	User Name: <input type="text"  name="name"/>
    	<br/>
    	Language: <select size="1" name="language">
    		<option>Japanese</option>
    		<option>Tamil</option>
    		<option>English</option>
    	</select>
    	 <br/>
    	<select name="topics" multiple="multiple">
    		<option>Polticis</option>
    		<option>Local</option>
    		<option>Culture</option>
    	</select><br/> 
    	<input type="Submit" value="Send"></input>
    </form>
    
        <table width='500' border='1'>  
      <tr>  
        <th align='left'>Customer Id</th>  
        <th align='left'>Customer First Name</th>  
        <th align='left'>Customer Last Name</th>  
      </tr>  
      <c:forEach var="result" items="${result.rows}">  
        <tr>  
           <td> ${result.CUSTOMER_ID}</td>  
           <td> ${result.CUST_FIRST_NAME} </td>  
           <td> ${result.CUST_LAST_NAME} </td>  
       </tr>  
      </c:forEach>  
    </table> 
</body>
</html>