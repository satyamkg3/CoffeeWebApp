package com.satyam.model.persistenseLayer;

import com.satyam.pojo.Discount;

import java.sql.*;
import java.util.ArrayList;

public class DiscountDaoImpl implements DiscountDao{
    @Override
    public ArrayList searchDiscount() throws ClassNotFoundException, SQLException {
        ArrayList<Discount> discountArray = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false","root","admin");
        preparedStatement = connection.prepareStatement("select * from discount");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            Discount discount = new Discount();
            discount.setCouponID(resultSet.getInt("couponID"));
            discount.setCouponName(resultSet.getString("couponName"));
            discount.setMinCost(resultSet.getInt("minCost"));
            discount.setPercentage(resultSet.getInt("percentage"));
            discountArray.add(discount);
        }
        return discountArray;
    }
    public Discount searchDiscount(int discountId) throws ClassNotFoundException, SQLException {
        Discount discount = new Discount();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false", "root", "admin");
        preparedStatement = connection.prepareStatement("select * from discount where couponID =?");
        preparedStatement.setInt(1, discountId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            discount.setCouponID(resultSet.getInt("couponID"));
            discount.setCouponName(resultSet.getString("couponName"));
            discount.setMinCost(resultSet.getInt("minCost"));
            discount.setPercentage(resultSet.getInt("percentage"));
        }
        return discount;
    }
}
