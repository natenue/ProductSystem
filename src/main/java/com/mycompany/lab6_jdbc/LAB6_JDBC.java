/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab6_jdbc;

import java.util.List;
import javax.swing.JFrame;
import models.Product;
import utils.CreatePanel;
import utils.DatabaseUtils;
import utils.MainFrame;

/**
 *
 * @author NATE
 */
public class LAB6_JDBC {

    public static void main(String[] args) {
        DatabaseUtils dbUtils = new DatabaseUtils();
        
        JFrame frame = new JFrame("");
        CreatePanel create = new CreatePanel();
        MainFrame mf  = new MainFrame();
        frame.add(mf);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(540, 700);
        
        
        
//        List<Product> products = dbUtils.getProducts();
//        
//        for (Product product : products){
//            System.out.println(product.toString());
//        }
//        
//        Product p1 = new Product("Apple", 10);
//        Product p2 = new Product("Banana", 20);
//        
//        dbUtils.insertProduct(p1);
//        dbUtils.insertProduct(p2);
//        System.out.println("INSERTION DONE");
        
    }
}
