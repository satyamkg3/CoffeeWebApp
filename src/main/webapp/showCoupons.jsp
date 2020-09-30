<%@ page import="com.satyam.pojo.Discount" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/5/2020
  Time: 11:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>Show coupons</title>
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
        table, th, td{
            border: 1px darksalmon;
        }
        th, td{
            padding: 10px;
        }
    </style>
</head>
<body>
<h2>Select Coupon</h2>
<table>
    <tr>
        <th>Coupon ID</th>
        <th>Coupon Name</th>
        <th>Coupon Min Cost</th>
    </tr>
    <%
        ArrayList<Discount> arrayList = (ArrayList<Discount>)session.getAttribute("couponsList");
        if(arrayList != null)
        {
            for(Discount discount: arrayList)
            {
    %>
    <tr>
        <td><%=discount.getCouponID()%></td>
        <td><%=discount.getCouponName()%></td>
        <td><%=discount.getMinCost()%></td>
    </tr>
    <%}
    }%>
</table>
<form action="./takeOrder" method="get">
    Enter Coupon ID: <input type="text" name="couponid">
    <br>
    <input type="submit" value="Get Bill">
</form>

</body>
</html>
