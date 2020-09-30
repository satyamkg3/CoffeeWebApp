package com.satyam.model.businessLogic;

import com.satyam.model.persistenseLayer.DiscountDaoImpl;
import com.satyam.pojo.Discount;

import java.sql.SQLException;
import java.util.ArrayList;

public class DiscountBL {

    private DiscountDaoImpl discountDao = new DiscountDaoImpl();

    public ArrayList showCoupons() throws SQLException, ClassNotFoundException {
        ArrayList<Discount> discountArray;
        discountArray = discountDao.searchDiscount();
        return discountArray;
    }
}
