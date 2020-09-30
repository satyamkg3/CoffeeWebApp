package com.satyam.model.persistenseLayer;

import com.satyam.pojo.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDaoImpl implements OrderDao{

    @Override
    public void insertOrder(Order order,double bill) throws ClassNotFoundException, SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false","root","admin");
        preparedStatement = connection.prepareStatement("insert into placeOrder(coffeeID,addOnID,sizeID,couponID,totalPrice) values(?,?,?,?,?)");
        preparedStatement.setInt(1,order.getCoffeeID());
        preparedStatement.setInt(2,order.getAddOnsID());
        preparedStatement.setInt(3,order.getSizeID());
        preparedStatement.setInt(4,order.getCouponID());
        preparedStatement.setDouble(5,bill);
        int check = preparedStatement.executeUpdate();
        if(check>0)
        {
            System.out.println("Your order has been placed, please collect your bill.");
        }
        else
        {
            System.out.println("Something went wrong in OrderDao.");
        }
    }
}
