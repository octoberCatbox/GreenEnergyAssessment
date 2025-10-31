
package models;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

/**
 *
 * @author 30562534
 */
public class DBManager 

{
 
    private final String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
    private final String connectionString = "jdbc:ucanaccess://Data\\ShopDB.accdb";
    
    public ArrayList<Customer> loadCustomers()
    {
        ArrayList<Customer> allCustomers = new ArrayList();
        
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString); 
            // conn is our var
            Statement stmt = conn.createStatement();
            // stmt is our var
            ResultSet rs = stmt.executeQuery("SELECT * FROM Customers");
            // rs is our var, SELECT * FROM is sql, and Customers is our Tablename
            
            while(rs.next())
                // Username, Password, FirstName, LastName, AddressLine1, AddressLine2
                // Town, Postcode
            {
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String addressLine1 = rs.getString("AddressLine1");
                String addressLine2 = rs.getString("AddressLine2");
                String town = rs.getString("Town");
                String postcode = rs.getString("Postcode");
                
                
                //public Customer(String UsernameIn, String PasswordIn, 
                //String FirstNameIn, String LastNameIn, String addressLine1In, 
                //String addressLine2In, 
                //String townIn, String postcodeIn)
                Customer c = new Customer(username, password, firstName, lastName, 
                                addressLine1, addressLine2, town, postcode);
                
                allCustomers.add(c);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error Loading Customers from DB" + ex.getMessage());
        }
                finally
        {
            return allCustomers;
        }
    }
    public ArrayList<Staff> loadStaff()
    {
        ArrayList<Staff> allStaff = new ArrayList();
        
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString); 
            // conn is our var
            Statement stmt = conn.createStatement();
            // stmt is our var
            ResultSet rs = stmt.executeQuery("SELECT * FROM Staff");
            // rs is our var, SELECT * FROM is sql, and Staff is our Tablename
            
            while(rs.next())
                // Username, Password, FirstName, LastName, Position, Salary
            {
                String username = rs.getString("Username");
                String password = rs.getString("Password");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String position = rs.getString("Position");
                double salary = rs.getDouble("Salary");
                
                
                /*
                public Staff(String UsernameIn, String PasswordIn, String FirstNameIn,
                String LastNameIn,
		String positionIn, double salaryIn)
                */ 
          
                Staff s = new Staff(username, password, firstName, lastName, 
                                position, salary);
                
                allStaff.add(s);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Error Loading Staff from DB" + ex.getMessage());
        }
                finally
        {
            return allStaff;
        }
    }
    
    public ArrayList<Product> loadProducts()
    {
        ArrayList<Product> allProducts = new ArrayList();
        
        try
        {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
            
            while(rs.next())
            {
                //   public Product (int ProductIDIn, String ProductNameIn, 
                //      double PriceIn, int StockLevelIn)
                int ProductID = rs.getInt("ProductId");
                String ProductName = rs.getString("ProductName");
                double Price = rs.getDouble("Price");
                int StockLevel = rs.getInt("StockLevel");
                int wattageOutput = rs.getInt("WattageOutput");
                double efficiencyRating = rs.getDouble("EfficiencyRating");
                String ProductType = rs.getString("ProductType");
                
                if (ProductType.equals("Solar Panel"))
                {
                    // public SolarPanel(int ProductIDIn, String ProductNameIn,
                    // double PriceIn, int StockLevelIn, int wattageOutputIn)
                    SolarPanel sp = new SolarPanel(ProductID, ProductName, 
                            Price, StockLevel, wattageOutput);
                    allProducts.add(sp);
                }
                
                else if (ProductType.equals("Heat Pump"))
                {
                    // 	public HeatPump(int ProductIDIn, String ProductNameIn, 
                    // double PriceIn, int StockLevelIn, double efficiencyRatingIn)
                    HeatPump hp = new HeatPump(ProductID, ProductName, 
                            Price, StockLevel, efficiencyRating);
                    allProducts.add(hp);
                }

            }
        }
        catch(Exception ex)
        {
            System.out.println("Error loading products" +ex.getMessage());
        }
        finally
        {
            return allProducts;
        }
    }
    
    public Customer customerLogin(String username, String password)
    {
        ArrayList<Customer> allCustomers = loadCustomers();
        //load array list for customers
        for (Customer c : allCustomers) // for each loop
        {
            if (c.getUsername().equals(username) && 
                    c.getPassword().equals(password))
                //compare pw and username
            {
                return c;
                //returns var containing Pw/username from db
            }
        }
        return null;
    }
    
    public Staff staffLogin(String username, String password)
            // same as above
    {
        ArrayList<Staff> allStaff = loadStaff();
        
        for (Staff s : allStaff)
        {
            if (s.getUsername().equals(username) && 
                    s.getPassword().equals(password))
            {
                return s;
            }
        }
        return null;
    }
   
}
