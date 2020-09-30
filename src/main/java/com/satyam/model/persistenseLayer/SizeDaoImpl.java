package com.satyam.model.persistenseLayer;

import com.satyam.pojo.Size;

import java.sql.*;
import java.util.ArrayList;

public class SizeDaoImpl implements SizeDao{
    @Override
    public ArrayList<Size> getAllSize() throws ClassNotFoundException, SQLException {
        ArrayList<Size> sizeArr = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false","root","admin");
        preparedStatement = connection.prepareStatement("select * from size");
        ResultSet resultSet = preparedStatement.executeQuery();

        while(resultSet.next())
        {
            Size size = new Size();
            size.setSizeID(resultSet.getInt("sizeID"));
            size.setSizeName(resultSet.getString("sizeName"));
            size.setPrice(resultSet.getDouble("price"));
            sizeArr.add(size);
        }
        return sizeArr;
    }

    public Size getPrice(int sizeId) throws ClassNotFoundException, SQLException {
        Size size = new Size();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coffeemavenjdbc?useSSL=false","root","admin");
        preparedStatement = connection.prepareStatement("select * from size where sizeID = ?");
        preparedStatement.setInt(1,sizeId);
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next())
        {
            size.setSizeID(resultSet.getInt("sizeID"));
            size.setSizeName(resultSet.getString("sizeName"));
            size.setPrice(resultSet.getDouble("price"));
        }
        return size;
    }
}
