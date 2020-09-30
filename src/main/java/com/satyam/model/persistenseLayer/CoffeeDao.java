package com.satyam.model.persistenseLayer;

import com.satyam.pojo.Coffee;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoffeeDao {
    ArrayList getAllCoffee() throws ClassNotFoundException, SQLException;
    ArrayList getCoffeePrice() throws ClassNotFoundException, SQLException;
    Coffee getCoffeePrice(int id) throws ClassNotFoundException, SQLException;

}
