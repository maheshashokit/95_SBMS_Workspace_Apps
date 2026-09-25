<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>wishes.jsp</title>
</head>
<body>
   <div style="text-align:center;color:red">${wishMessage}</div>
   <table border="2">
     <tr>
       <td>Employee ID</td>
       <td>Employee Name</td>
       <td>Employee Location</td>
     </tr>
     <tbody>
       <c:forEach items="${employees}" var="employee">
		   <tr>
		      <td>${employee.empId}</td>
		      <td>${employee.empName}</td>
		      <td>${employee.location}</td>
		   </tr>	    
   		</c:forEach>
     </tbody>
   </table>
   
</body>
</html>