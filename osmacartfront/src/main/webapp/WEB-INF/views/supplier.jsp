<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
       
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
     
           <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="admin.jsp"></jsp:include><br>

<title>Insert title here</title>
</head>
<body>
<div class="container-fluid" style="background-color:orange;color:black;height:80px;">
  <center><h2>WELCOME ADMIN</h2></center>
</div>
       
	<div class="cat">
	<h1>Suppliers</h1>

	<c:url var="addAction" value="/addsupplier"></c:url>

	<form:form action="${addAction}" commandName="supplier">
		<table>
	<c:if test="${!empty supplier.name}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
			<form:errors path="name"></form:errors>
		</td> 
	</tr>	
	<tr>
		<td>
			<form:label path="address">
				<spring:message text="Address"/>
			</form:label>
		</td>
		<td>
			<form:input path="address" />
			<form:errors path="address"/>
		</td>
	</tr>
	
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty supplier.name}">
				<input type="submit"
					value="<spring:message text="Edit Supplier"/>" />
			</c:if>
			<c:if test="${empty supplier.name}">
				<input type="submit"
					value="<spring:message text="Add Supplier"/>" />
			</c:if>
		</td>
	</tr>
</table>	
	</form:form>
	</div>
	<br>
	<h3>Suppliers List</h3>
	<c:if test="${!empty supplierList}">
		<table class="tg">
			<tr>
				<th width="80">Supplier ID</th>
				<th width="120">Supplier Name</th>
				<th width="120">Supplier Address</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${supplierList}" var="supplier">
				<tr>
					<td>${supplier.id}</td>
					<td>${supplier.name}</td>
					<td>${supplier.address}</td>
					<td><a href="<c:url value='editsupplier/${supplier.id}' />">Edit</a></td>
					<td><a href="<c:url value='removeid2/${supplier.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<jsp:include page="footer.jsp"></jsp:include><br>

	</body>
	</html>