<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      <%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<jsp:include page="header.jsp"></jsp:include><br>

</head>
<body>
<form class="form-horizontal" action="registration " method="POST">
<fieldset>

        <!-- Form Name -->
        <legend>Register</legend>
        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="name">First Name</label>  
          <div class="col-md-4">
          <input id="name" name="name" type="text" placeholder="First Name" class="form-control input-md" required="">
            
          </div>
        </div>
         <div class="form-group">
          <label class="col-md-4 control-label" for="name">Last Name</label>  
          <div class="col-md-4">
          <input id="name" name="name" type="text" placeholder="Last Name" class="form-control input-md" required="">
            
          </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="phone">Phone</label>  
          <div class="col-md-4">
          <input id="phone" name="phone" type="text" placeholder="Phone Number" class="form-control input-md" required="">
          <span class="help-block">Business Phone</span>  
          </div>
        </div>

        <!-- Text input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="email">Email</label>  
          <div class="col-md-4">
          <input id="email" name="email" type="text" placeholder="Email address" class="form-control input-md" required="">
          <span class="help-block">Email will be used for notication messages</span>  
          </div>
        </div>

        <!-- Password input-->
        <div class="form-group">
          <label class="col-md-4 control-label" for="password">Password </label>
          <div class="col-md-4">
            <input id="password" name="password" type="password" placeholder="Password " class="form-control input-md" required="">
            <span class="help-block">Admin Password </span>
          </div>
        </div>

                <!-- Button (Double) -->
        <div class="form-group">
          <label class="col-md-4 control-label" for="save"></label>
          <div class="col-md-8">
           <button type="submit" value="registeration" class="btn btn-primary btn-lg btn-small register-button">save</button>
          </div>
        </div>

        </fieldset>
        </form>
<jsp:include page="footer.jsp"></jsp:include><br>
</body>
</html>