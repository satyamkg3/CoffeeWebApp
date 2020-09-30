<%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/7/2020
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Total bill</title>
</head>
<body>
<h3>Your order has been placed</h3>
<%double bill =  (double)session.getAttribute("bill"); %>
Bill: <%= bill%>
</body>
</html>
