package com.satyam.model.businessLogic;

import com.satyam.model.persistenseLayer.AddOnsDaoImpl;
import com.satyam.pojo.AddOns;

import java.sql.SQLException;
import java.util.ArrayList;

public class AddOnBL {
    private AddOnsDaoImpl addOnsDao = new AddOnsDaoImpl();

    public ArrayList getAllAddOns() throws SQLException, ClassNotFoundException
    {
        ArrayList<AddOns> addOns = new ArrayList<>();

        addOns = addOnsDao.getAddOns();
        return addOns;
    }
    /*

    public void searchAddOns(String addOnName) throws SQLException, ClassNotFoundException {
        AddOns addOns = new AddOns();
        Scanner scan = new Scanner(System.in);
        addOns = searchAddOn.searchAddOns(addOnName);
        System.out.println("AddOn "+ addOns.getAddOnsName() + " is available and price is "+addOns.getPrice());
    }

     */
}
