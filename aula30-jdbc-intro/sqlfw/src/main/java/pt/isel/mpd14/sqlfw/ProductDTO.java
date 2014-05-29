/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pt.isel.mpd14.sqlfw;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HelioCaetano
 */
public class ProductDTO {
    
    public static Iterable<Product> getProducts(ResultSet rs) throws SQLException{
        List<Product> products = new ArrayList<Product>();
        while(rs.next())
            products.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
        return products;
    }
}
