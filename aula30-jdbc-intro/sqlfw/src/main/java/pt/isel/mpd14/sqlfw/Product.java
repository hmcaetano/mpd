/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.sqlfw;

import java.sql.ResultSet;

/**
 *
 * @author HelioCaetano
 */
public class Product {
    public final int id, unitsInStock;
    public final String name;
    public final double price;
    
    public Product(int id, String name, double price, int unitsInStock){
        this.id = id;
        this.name = name;
        this.price = price;
        this.unitsInStock = unitsInStock;
    }
}
