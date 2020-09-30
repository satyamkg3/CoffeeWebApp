<%@ page import="com.satyam.pojo.Size" %>
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
    <title>show Size</title>
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
<h2>Choose your coffee size</h2>
<table>
    <tr>
        <th>Size ID</th>
        <th>Size Name</th>
        <th>Size Price</th>
    </tr>
    <%
        ArrayList<Size> arrayList = (ArrayList<Size>)session.getAttribute("allSize");
        if(arrayList != null)
        {
            for(Size size: arrayList)
            {
    %>
    <tr>
        <td><%=size.getSizeID()%></td>
        <td><%=size.getSizeName()%></td>
        <td><%=size.getPrice()%></td>
    </tr>
    <%}
    }%>
</table>
<form action="./showCoupons" method="get">
    Enter Size ID: <input type="text" name="sizeid">
    <br>
    <input type="submit" value="next">
</form>

</body>
</html>
