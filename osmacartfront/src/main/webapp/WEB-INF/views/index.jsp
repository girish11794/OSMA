<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h1>CARTSITE</h1>
<hr>
<jsp:include page="header.jsp"></jsp:include><br>
<c:if test="${not empty SuccessMessage}">
                         <jsp:include page="ourproduct.jsp"></jsp:include>
                       
                                    </c:if>   
<c:if test="${empty successadmin}">
</c:if>
<c:if test="${userClickedLogin}">
<jsp:include page="login.jsp"></jsp:include><br>
</c:if>
<c:if test="${userClickedAboutus}">
<jsp:include page="aboutus.jsp"></jsp:include><br>
</c:if>
<c:if test="${userClickedContactus}">
<jsp:include page="contactus.jsp"></jsp:include><br>
</c:if>
<c:if test="${userClickedAdmin}">
<jsp:include page="admin.jsp"></jsp:include><br>
</c:if>
<c:if test="${userClickedRegister}">
<jsp:include page="register.jsp"></jsp:include>
</c:if>
<c:if test="${userClickedMycart}">
<jsp:include page="mycart.jsp"></jsp:include><br>
</c:if>
<c:out value="${ErrorMessage}"/>
<c:out value="${SuccessMessage}"/>
${registermessage}
<jsp:include page="home.jsp"></jsp:include><br>
<jsp:include page="footer.jsp"></jsp:include><br>
</body>
</html>