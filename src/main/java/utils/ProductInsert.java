/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javafx.scene.control.Alert;


/**
 *
 * @author OPD NUR STATION
 */
public class ProductInsert {
      public static DbConnection dbConnection = DbConnection.getInstance();


// This code inser data into the dadabase
    public static  int insert(Products products){
        int res = 0;
        try{
            String query = "insert into Price values(?,?,?)";

            PreparedStatement ps = dbConnection.getConnection().prepareStatement(query);
            ps.setInt(1,products.getId());
            ps.setString(2, products.getName());
            ps.setInt(3, products.getPrice());



            res = ps.executeUpdate();
        }catch (SQLException e){
            Alert alert = new Alert(Alert.AlertType.ERROR,e.getMessage());
            alert.showAndWait();
        }
        return res;

    }
    
}
