package com.satyam.model.persistenseLayer;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AddOnsDao {
    ArrayList getAddOns() throws SQLException, ClassNotFoundException;
    //AddOns searchAddOns(String addon) throws ClassNotFoundException, SQLException;
    //AddOns searchAddOns(int addonID) throws ClassNotFoundException, SQLException;

}
