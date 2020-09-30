<%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/4/2020
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>coffee shop</title>
    <style>
        body
        {

            background-color: cadetblue;
        }
        a:link, a:visited{
            background-color: coral;
            color: white;
            padding: 15px 25px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }
        .header{
            background-color: crimson;
            padding: 20px;
            text-align: center;
        }
        .links
        {
            overflow: hidden;
            background-color: goldenrod;
            alignment: center;
        }
        .links a
        {
            float: end;
            display: block;
            color:aliceblue;
            text-align: center;
        }
        .links a:hover
        {
            background-color: black;
            color: blanchedalmond;
        }
    </style>
</head>
<body>
<div class="header">
<h1>welcome</h1>
</div>
<%--
<jsp:forward page="showCoffee.jsp"></jsp:forward>
<jsp:include page="showCoffee.jsp"/>
--%>
<div class="links">
    <br>
<a href="./showCoffee">Show Coffee</a>
 <%--   <br>
    <a href="./showAddOns">AddOns</a>
    <br>
    <a href="./showSize">Size</a>
    <br>
<a href="./showCoupons">Show Coupons</a>
--%>
</div>
</body>
</html>
