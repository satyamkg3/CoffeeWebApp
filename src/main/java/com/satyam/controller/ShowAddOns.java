package com.satyam.controller;

import com.satyam.model.businessLogic.AddOnBL;
import com.satyam.pojo.AddOns;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowAddOns extends HttpServlet{
    AddOnBL addOnBL = new AddOnBL();
    ArrayList<AddOns> addOnsArrayList = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession(true);

        session.setAttribute("coffeeid",req.getParameter("coffeeid"));

        try {
            addOnsArrayList = addOnBL.getAllAddOns();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        session.setAttribute("addOnsList",addOnsArrayList);
        resp.sendRedirect("./showAddOns.jsp");
    }
}
