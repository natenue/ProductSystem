/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor.URL;
import models.Product;

/**
 *
 * @author NATE
 */
public class DatabaseUtils {
//    
//    private final String Host = "localhost:3306";
//    private final String user = "root";
//    private final String DataBaseName = "products";
//    private final String pass = "admin";
//    private final String Driver = "jdbc.mysql.cj.jdbc.Driver";
//    private final String URL = "jdbc:mysql://"+ Host + "/" + DataBaseName;
//    
//    String connStr = "jdbc:mysql://localhost:3306/products";
//    
//    public DatabaseUtils(){
//        try{
//            String Driver = null;
//            Class.forName(Driver);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//    }
//    public static DbConnecction getInstance(){
//        Object connecctivity = null;
//        if (connecctivity == null){
//            connecctivity = new DbConnecction();
//        }
//        return (DbConnecction) connecctivity;
//    }
//
//    public Connection getConnection() {
//        Connection connection = null;
//        return connection;
//    }
//     
//    public List<Product> getProducts(){
//        List<Product> products = new ArrayList<>();
//        String QUERY = "SELECT * FROM product";
//    
//        try{
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql:QUERY);
//            
//            while (rs.next()){
//                Product product = new Product(rs.getInt(1), rs.getString(2),  rs.getDouble(3))
//                products.add(product);
//                
//            stmt.close();    
//            }
//        }
//        catch (SQLException ex){
//            System.out.println("Error while fetching data... " +ex.getMessage() );
//        
//    }
//        return products;
//    }
//    
//    public boolean insertProduct (Product product){
//        String QUERY = "INSERT INTO product (name, price) VALUES (?,?)";
//        
//        
//        try{
//            PreparedStatement ps = conn.prepareStatement(QUERY);      
//            ps.setString(2,product.getName());
//             ps.setDouble(3,product.getPrice());
//             int row = ps.executeUpdate();
//             
//             if (row > 0){
//                 return true;
//             }else {
//                 return false;
//             }
//                 
//             
//             
//             
//        }catch (SQLException ex){
//            System.out.println("Error while inserting data... " +ex.getMessage() );
//                return false;
//    
//        }
//    
//        
//        public void close(){
//            
//            try{
//            conn.close();
//        } catch (SQLException ex){
//            System.out.println("Error");
//        }
//        
//    }
}
    

