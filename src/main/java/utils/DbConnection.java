/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author OPD NUR STATION
 */
public class DbConnection {
     private final String Host = "localhost:3306";
    private final String User = "root";
    private final String DataBaseName = "products";
    private final String Password = "admin";
    private final String Driver = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://"+ Host + "/" + DataBaseName;


    private Connection connection;
    public static DbConnection connecctivity;
    public  DbConnection(){
        try{
            Class.forName(Driver);
            connection =  DriverManager.getConnection(URL, User,Password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static DbConnection getInstance(){
        if (connecctivity == null){
            connecctivity = new DbConnection();
        }
        return connecctivity;
    }

    public Connection getConnection() {
        return connection;
    }
 
    
}
