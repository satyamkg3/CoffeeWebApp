package com.satyam.controller;

import com.satyam.model.businessLogic.DiscountBL;
import com.satyam.pojo.Discount;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowCoupons extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession(true);
        ArrayList<Discount> discountArrayList = new ArrayList<>();
        Discount discount = new Discount();
        DiscountBL discountBL = new DiscountBL();

        session.setAttribute("sizeid",req.getParameter("sizeid"));

        try {
            discountArrayList = discountBL.showCoupons();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        session.setAttribute("couponsList",discountArrayList);
        resp.sendRedirect("./showCoupons.jsp");
    }
}
