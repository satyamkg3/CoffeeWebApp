<%@ page import="java.util.ArrayList" %>
<%@ page import="com.satyam.pojo.Coffee" %><%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/4/2020
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>List of Coffee</title>
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
<h2 align="center">Here are all coffee</h2>
<table>
    <tr>
        <th>Coffee ID</th>
        <th>Coffee Name</th>
        <th>Coffee Price</th>
    </tr>
<%
    ArrayList<Coffee> arrayList = (ArrayList<Coffee>)session.getAttribute("coffeeList");
    //System.out.println("array list of coffee "+arrayList);
    if(arrayList != null)
    {
    for(Coffee coffee: arrayList)
    {
%>

    <tr>
        <td><%=coffee.getCoffeeID()%></td>
        <td><%= coffee.getCoffeeName()%></td>
        <td><%=coffee.getPrice()%></td>
    </tr>
<%}}
%>
</table>
<br><br>
<form action="./showAddOns" method="get">
    Enter coffee ID: <input type="text" name="coffeeid">
    <input type="submit" value="next">
</form>
<br>

</body>
</html>
