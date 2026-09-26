<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>studentEnquiry.jsp</title>
</head>
<body>
    <div style="text-align:center;color:red;">Welcome To Student Enquiry Form</div><br/>
    
    <c:if test="${message ne null}">
       <div style="text-align:center;color:blue">${message}</div>
       <table align="center" border="2">
          <tr>
            <th>S.No</th>
            <th>Name</th>
            <th>EmailId</th>
            <th>ContactNo</th>
            <th>Course</th>
          </tr>
		  <c:forEach items="${enquiryList}" var="enquiry" varStatus="loopStatus">
			<tr>
			   <td>${loopStatus.index + 1}</td>
			   <td>${enquiry.name}</td>
			   <td>${enquiry.emailId}</td>
			   <td>${enquiry.contactNo}</td>
			   <td>${enquiry.course}</td>
			</tr>
		  </c:forEach>
		</table>
    </c:if>
    <c:if test="${message eq null}">
	<spring:form action="studentenquiry" modelAttribute="enquiryObject">
		<table align="center">
			<tr>
				<td>Enquiry Name</td>
				<td><spring:input path="name"/></td>
			</tr>
			<tr>
				<td>Email Id</td>
				<td><spring:input path="emailId" /></td>
			</tr>
			<tr>
				<td>ContactNumber</td>
				<td><spring:input path="contactNo" /></td>
			</tr>
			<tr>
				<td>Course</td>
				<td><spring:select path="course">
						<spring:option value=""></spring:option>
						<spring:option value="springboot">SpringBoot</spring:option>
						<spring:option value="aws">Amazon WebServices</spring:option>
						<spring:option value="reactjs">React-JS</spring:option>
						<spring:option value="angularjs">Angular-JS</spring:option>
				</spring:select></td>
			</tr>
		</table>
		<br/>
        <div style="text-align: center">
			<spring:button>Send Enquiry</spring:button>
		</div>
	</spring:form>
	</c:if>
</body>
</html>