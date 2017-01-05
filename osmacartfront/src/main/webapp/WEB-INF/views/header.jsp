<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>OSMA</title>
<head>
<style>
body{
background-image: url("http://cdn.wallpapersafari.com/22/48/fdeaiI.jpg")
}
</style>
</head>
<body>
 
    
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="home">Home</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="aboutus">ABOUT US</a></li>
<li><a href="contactus">CONTACT US</a></li>
                              </ul>
           <ul class="nav navbar-nav pull-right">
    <c:if test="${empty SuccessMessage}">
            <li><a href="login">login<span class="glyphicon glyphicon-log-in"></span></a></li>
      <li><a href="register">register<span class="glyphicon glyphicon-user"></span></a></li>
      </c:if>
      <c:if test="${not empty SuccessMessage}">
       <li><a href="mycart">My Cart<span class="glyphicon glyphicon-shopping-cart"></span></a></li>
       <li><a href="login">Logout<span class="glyphicon glyphicon-log-out"></span></a></li>
                     </c:if>
           
       </ul>
        
        </div>
              </nav>
              
   </body>
</html>


