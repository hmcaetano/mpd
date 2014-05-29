package pt.isel.mpd14.sqlfw;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import static java.lang.String.format;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("myAppUser");
        ds.setPassword("fcp");
        ds.setServerName("localhost");
        ds.setPortNumber(1433);
        ds.setDatabaseName("Northwind");
        Connection c = ds.getConnection();
        
        PreparedStatement cmd = c.prepareStatement(
                "SELECT ProductID, ProductName, UnitPrice, UnitsInStock "
                        + "FROM Products WHERE UnitPrice > ? AND UnitsInStock > ?");
        cmd.setDouble(1, 30.0);
        cmd.setInt(2, 20);
        ResultSet rs = cmd.executeQuery();
        Iterable<Product> products = ProductDTO.getProducts(rs);
        
        for(Product p : products)
            System.out.println(format("%d %s %f %d", p.id, p.name, p.price, p.unitsInStock));
    }
}
