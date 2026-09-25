<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>enquiryForm.jsp</title>
</head>
<body>
    <div style="text-align:center;color:red;">Welcome To AshokIT Enquiry Form</div><br/>
    
    <c:if test="${message ne null}">
       <div style="text-align:center;color:blue">${message}</div>
    </c:if>
    <c:if test="${message eq null}">
	<form action="enquiry" method="post">
		<table align="center">
			<tr>
				<td>Enquiry Name</td>
				<td><input type="text" name="enquiryName" /></td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><input type="text" name="emailId" /></td>
			</tr>
			<tr>
				<td>ContactNumber</td>
				<td><input type="text" name="contactNo" /></td>
			</tr>
			<tr>
				<td>Course</td>
				<td><select name="course">
						<option value=""></option>
						<option value="springboot">SpringBoot</option>
						<option value="aws">Amazon WebServices</option>
						<option value="reactjs">React-JS</option>
						<option value="angularjs">Angular-JS</option>
				</select></td>
			</tr>
		</table>
		<br/>
        <div style="text-align: center">
			<input type="submit" value="Send Enquiry" />
		</div>
	</form>
	</c:if>
</body>
</html>