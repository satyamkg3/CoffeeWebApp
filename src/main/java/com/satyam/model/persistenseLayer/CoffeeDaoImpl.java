package com.satyam.model.persistenseLayer;

import com.satyam.pojo.Coffee;

import java.sql.*;
import java.util.ArrayList;

public class CoffeeDaoImpl implements CoffeeDao{
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    //DBConnect db = new DBConnect();
    @Override
    public ArrayList<Coffee> getAllCoffee() throws ClassNotFoundException, SQLException {
        ArrayList<Coffee> coffeeList = new ArrayList<>();
        //System.out.println("Inside Coffee");
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false", "root", "admin");
        preparedStatement = connection.prepareStatement("SELECT * FROM coffee");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            Coffee coffee = new Coffee();
            coffee.setCoffeeID(resultSet.getInt("coffeeID"));
            coffee.setCoffeeName(resultSet.getString("coffeeName"));
            coffee.setPrice(resultSet.getDouble("price"));
            coffeeList.add(coffee);
            //System.out.println(coffee);
        }
        return coffeeList;
    }
    @Override
    public ArrayList getCoffeePrice() throws ClassNotFoundException, SQLException{
        ArrayList<Coffee> coffeeList = new ArrayList<>();
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?allowPublicKeyRetrieval=true&useSSL=false", "root", "admin");
        preparedStatement = connection.prepareStatement("SELECT * FROM coffee");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next())
        {
            Coffee coffee = new Coffee();
            coffee.setCoffeeID(resultSet.getInt("coffeeID"));
            coffee.setCoffeeName(resultSet.getString("coffeeName"));
            coffee.setPrice(resultSet.getDouble("price"));
            coffeeList.add(coffee);

        }
        return coffeeList;
    }

    public Coffee getCoffeePrice(int coffeeId) throws ClassNotFoundException, SQLException{
        Coffee coffee = new Coffee();
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false", "root", "admin");
        preparedStatement = connection.prepareStatement("SELECT * FROM coffee where coffeeID=?");
        preparedStatement.setInt(1,coffeeId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next())
        {
            coffee.setCoffeeID(resultSet.getInt("coffeeID"));
            coffee.setCoffeeName(resultSet.getString("coffeeName"));
            coffee.setPrice(resultSet.getDouble("price"));

        }
        return coffee;
    }
}
