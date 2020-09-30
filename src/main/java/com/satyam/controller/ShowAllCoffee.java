package com.satyam.controller;

import com.satyam.model.businessLogic.CoffeeBL;
import com.satyam.pojo.Coffee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShowAllCoffee extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        //PrintWriter pw = resp.getWriter();
        //pw.println("<a href=\"./showCoffee\">COFFEE</a>");
        HttpSession session = req.getSession(true);
        CoffeeBL coffeeBL = new CoffeeBL();
        ArrayList<Coffee> arrayList=null;
        try {
            arrayList = coffeeBL.getAllCoffeeList();
            //System.out.println(arrayList);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //System.out.println("list of coffee: "+arrayList);
        session.setAttribute("coffeeList",arrayList);
        //System.out.println("List of Coffee is here "+(List<Coffee>)session.getAttribute("coffeeList"));
        resp.sendRedirect("./showCoffee.jsp");
        //resp.sendRedirect("./showCoffee.jsp");
        //RequestDispatcher requestDispatcher = req.getRequestDispatcher("showCoffee.jsp");
        //requestDispatcher.forward(req,resp);

    }
}
