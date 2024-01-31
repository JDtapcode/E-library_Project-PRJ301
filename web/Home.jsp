<%-- 
    Document   : Home.jsp
    Created on : Dec 13, 2023, 2:59:55 PM
    Author     : Macbook Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="css/allcss.jsp"%>
        <style type="text/css">
            .back-img{
                background: url("images/b3.png");
                height: 50vh;
                width: 100%;
                background-size: cover;
            }
        </style>
    </head>
    <body style="background-color: #f0f1f2">
         <%@include file="css/navbar.jsp" %>
         <div class="container-fluid back-img">
             <h2 class="text-center text-white"> EBooks Management System </h2>
         </div>
         <div class="container">
             <h3>Recent Book</h3>
             <div class="row">
                 <div class="col-md-3">
                     <c:forEach items="${listBB}" var="o">
                     <div class="card">
                      <div class="card-body text-center">
                          <img alt="" src="${o.image}" style="width: 150px; height: 200px"
                               class="img-thublin">
                         <p>Doi ngan dung ngu dai </p>
                         <p>Khong biet </p>
                         <div class="row">
                             <a href="" class="btn btn-danger btn-sm "> View </a>
                         </div>
                     </div>
                     </div>
                     </c:forEach>
                 </div>
             </div>    
         </div>
         
         
         
         
         
         
         <%@include file="css/footer.jsp" %>
    </body>
</html>
