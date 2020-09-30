<%@ page import="java.util.ArrayList" %>
<%@ page import="com.satyam.pojo.AddOns" %><%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/5/2020
  Time: 9:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <title>List of all AddOns</title>
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
<h2>Select your AddOns</h2>
<table>
    <tr>
        <th>AddOn ID</th>
        <th>AddOn Name</th>
        <th>AddOn Price</th>
    </tr>
<%
    ArrayList<AddOns> addOnsArrayList = (ArrayList<AddOns>) session.getAttribute("addOnsList");
    if(addOnsArrayList != null)
    {
        for(AddOns addOns:addOnsArrayList)
        {

%>
        <tr>
            <td><%=addOns.getAddOnsID()%></td>
            <td><%=addOns.getAddOnsName()%></td>
            <td><%=addOns.getPrice()%></td>
        </tr>
<%
}
    }
%>
</table>
<form action="./showSize" method="get">
    Enter AddOn ID: <input type="text" name="addOnid">
    <br>
    <input type="submit" value="next">
</form>

</body>
</html>
