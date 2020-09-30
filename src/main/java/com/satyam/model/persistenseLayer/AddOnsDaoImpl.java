package com.satyam.model.persistenseLayer;

import com.satyam.pojo.AddOns;

import java.sql.*;
import java.util.ArrayList;

public class AddOnsDaoImpl implements AddOnsDao {
    @Override
    public ArrayList<AddOns> getAddOns() throws SQLException, ClassNotFoundException {
        ArrayList<AddOns> addOnList = new ArrayList();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false", "root", "admin");
        preparedStatement = connection.prepareStatement("select * from addOns");
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next()) {
            AddOns addOns = new AddOns();
            addOns.setAddOnsID(resultSet.getInt("addOnID"));
            addOns.setAddOnsName(resultSet.getString("addOnName"));
            addOns.setPrice(resultSet.getDouble("price"));
            addOnList.add(addOns);
        }
        return addOnList;
    }
    /*
        @Override
        public AddOns searchAddOns(String name) throws ClassNotFoundException, SQLException {
            ArrayList<AddOns> addOnList = new ArrayList();
            AddOns addOns = new AddOns();

            Connection connection = null;
            PreparedStatement preparedStatement = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false", "root", "admin");
            preparedStatement = connection.prepareStatement("select * from addOns where addOnName = ?");
            preparedStatement.setString(1,name);
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()) {
                addOns.setAddOnsID(resultSet.getInt("addOnID"));
                addOns.setAddOnsName(resultSet.getString("addOnName"));
                addOns.setPrice(resultSet.getDouble("price"));
                addOnList.add(addOns);
            }
            return addOns;
        }
    */
    public AddOns searchAddOns(int addonId) throws ClassNotFoundException, SQLException {
        ArrayList<AddOns> addOnList = new ArrayList();
        AddOns addOns = new AddOns();

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false", "root", "admin");
        preparedStatement = connection.prepareStatement("select * from addOns where addOnID = ?");
        preparedStatement.setInt(1,addonId);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()) {
            addOns.setAddOnsID(resultSet.getInt("addOnID"));
            addOns.setAddOnsName(resultSet.getString("addOnName"));
            addOns.setPrice(resultSet.getDouble("price"));
            addOnList.add(addOns);
        }
        return addOns;
    }
}