package com.satyam.model.businessLogic;

import com.satyam.model.persistenseLayer.SizeDaoImpl;
import com.satyam.pojo.Size;

import java.sql.SQLException;
import java.util.ArrayList;

public class SizeBL {

    private SizeDaoImpl sizeDao = new SizeDaoImpl();


    public ArrayList getAllSize() throws SQLException, ClassNotFoundException
    {
        ArrayList<Size> sizeArrayList;
        sizeArrayList = sizeDao.getAllSize();
        return sizeArrayList;
    }
}
