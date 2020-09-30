package com.satyam.controller;

import com.satyam.model.businessLogic.SizeBL;
import com.satyam.pojo.Size;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ShowSize extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession(true);
        ArrayList<Size> sizeArrayList = new ArrayList<>();
        SizeBL sizeBL = new SizeBL();
        session.setAttribute("addonid",req.getParameter("addOnid"));

        try {
            sizeArrayList = sizeBL.getAllSize();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        session.setAttribute("allSize",sizeArrayList);
        resp.sendRedirect("./showSize.jsp");
    }
}
