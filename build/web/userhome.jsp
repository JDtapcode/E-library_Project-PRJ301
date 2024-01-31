<%-- 
    Document   : userhome
    Created on : Dec 13, 2023, 11:27:14 PM
    Author     : Macbook Pro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home: User</title>
    </head>
    <body>
        <h1> USER HOME </h1>

        <h1>Name:${object.name}</h1>
    
        <div class="col-sm-9">
    <div id="content" class="row">
        <c:forEach items="${listBB}" var="o">
                <div class="card">
                    <div class="card-body">
                    <img class="card-img-top" src="${o.image}" alt="Card image cap">
                             </div>
                </div>
        </c:forEach>
    </div>
</div>
     

</body>
</html>
