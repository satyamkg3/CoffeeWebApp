package com.satyam.controller;

import com.satyam.model.businessLogic.OrderBL;
import com.satyam.pojo.Coffee;
import com.satyam.pojo.Order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

public class TakeOrder extends HttpServlet {
    Coffee coffee = new Coffee();
    Order order = new Order();
    OrderBL orderBL = new OrderBL();
    int coffeeId=0;
    double bill = 0;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession(true);

        session.setAttribute("couponid",req.getParameter("couponid"));


        //System.out.println("coffeeid"+ coffeeid);
        //session.setAttribute("coffeeID",coffeeid);
        //coffeeId = (int)session.getAttribute("coffeeID");
        //System.out.println("Taken input: "+coffeeId);
        String coffeeid = (String)session.getAttribute("coffeeid");
        String addOnid = (String)session.getAttribute("addonid");
        String sizeid = (String)session.getAttribute("sizeid");
        String couponid = (String)session.getAttribute("couponid");
        //System.out.println("Attributes : "+coffeeid+addOnid+sizeid+couponid);

        //coffee.setCoffeeID(Integer.parseInt(coffeeid));

        //+" "+coupon+" "+size+" "+addOn);

        order.setCoffeeID(Integer.parseInt(coffeeid));
        order.setAddOnsID(Integer.parseInt(addOnid));
        order.setSizeID(Integer.parseInt(sizeid));
        order.setCouponID(Integer.parseInt(couponid));
        System.out.println("Taken order : "+order.getCoffeeID()+" "+order.getAddOnsID()+" "+order.getSizeID()+" "+order.getCouponID());


        try {
            bill = orderBL.calculateBill(order);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        session.setAttribute("bill",bill);
        resp.sendRedirect("./bill.jsp");
    }
}
