/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package utils;
/**
 *
 * @author OPD NUR STATION
 */
public class Products {
       private int id;
    private String name;
    private int price;

    public Products() {
    }

    public Products(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
  
}
