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
<div class="container-fluid" style="background-color:magenta;color:black;height:80px;">
  <center><h2>WELCOME ADMIN</h2></center>
</div>
       
	<div class="pro">
	<h1>Products</h1>

	<c:url var="addAction" value="/addproduct"></c:url>
<form:form action="${addAction}" modelAttribute="product" enctype="multipart/form-data">



<table>
	<c:if test="${!empty product.name}">
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
			<form:label path="price">
				<spring:message text="Price"/>
			</form:label>
		</td>
		<td>
			<form:input path="price" />
			<form:errors path="price"/>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="description">
				<spring:message text="Description"/>
			</form:label>
		</td>
		<td>
			<form:input path="description" />
			<form:errors path="description"/>
		</td>
	</tr>
	
	<tr>
		<td>
			<form:label path="image">
				<spring:message text="Image"/>
			</form:label>
		</td>
		<td>
			<form:input type="file" path="image" />
			<form:errors path="description"/>
		</td>
	</tr>
	
	
	
	<tr>
		<td colspan="2">
			<c:if test="${!empty product.name}">
				<input type="submit"
					value="<spring:message text="Edit product"/>" />
			</c:if>
			<c:if test="${empty product.name}">
				<input type="submit"
					value="<spring:message text="Add product"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Product List</h3>
<c:if test="${!empty listProduct}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Product Price</th>
		<th width="120">Product description</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProduct}" var="product">
		<tr>
			<td>${product.id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>${product.description}</td>
			<td><a href="<c:url value='/editid1/${product.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/removeid1/${product.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
	<jsp:include page="footer.jsp"></jsp:include><br>
</body>
</html>