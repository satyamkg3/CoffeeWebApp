package com.satyam.model.businessLogic;

import com.satyam.model.persistenseLayer.*;
import com.satyam.pojo.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderBL {

    private CoffeeDaoImpl coffeeDao = new CoffeeDaoImpl();
    private AddOnsDaoImpl addOnsDao = new AddOnsDaoImpl();
    private SizeDaoImpl sizeDao = new SizeDaoImpl();
    private DiscountDaoImpl discountDao = new DiscountDaoImpl();
    private OrderDaoImpl orderDao = new OrderDaoImpl();
    private Coffee coffee;
    private AddOns addOns;
    private Size size;
    private Discount discount;
    private Order orderVAr = new Order();
    private double bill=0;
    private ArrayList<String> details = new ArrayList<>();

    public double calculateBill(Order order) throws SQLException, ClassNotFoundException {

        coffee = coffeeDao.getCoffeePrice(order.getCoffeeID());
        bill += coffee.getPrice();

        addOns = addOnsDao.searchAddOns(order.getAddOnsID());
        bill += addOns.getPrice();

        size = sizeDao.getPrice(order.getSizeID());
        bill += size.getPrice();

        discount = discountDao.searchDiscount(order.getCouponID());
        bill = bill - (bill*discount.getPercentage())/100;

        orderDao.insertOrder(order,bill);
        return bill;
    }

    public ArrayList getDetails(Order order) throws SQLException, ClassNotFoundException {

        coffee = coffeeDao.getCoffeePrice(order.getCoffeeID());
        details.add(coffee.getCoffeeName());

        addOns = addOnsDao.searchAddOns(order.getAddOnsID());
        details.add(addOns.getAddOnsName());

        size = sizeDao.getPrice(order.getSizeID());
        details.add(size.getSizeName());

        discount = discountDao.searchDiscount(order.getCouponID());
        details.add(discount.getCouponName());

        return details;
    }
}
