package models;

public class Product 
{
    // attributes
    private int ProductID;
    private String ProductName;
    private double Price;
    private int StockLevel;
    
    
    // getters
    public int getProductID()
    {
        return ProductID;
    }
    
    public String getProductName()
    {
        return ProductName;
    }
    
    public double getPrice()
    {
        return Price;
    }
    
    public int getStockLevel()
    {
        return StockLevel;
    }
    
    // setters
    public void setProductID(int ProductIDIn)
    {
        ProductID = ProductIDIn;
    }
    
    public void setProductName(String ProductNameIn)
    {
        ProductName = ProductNameIn;
    }
    
    public void setPrice(double PriceIn)
    {
        Price = PriceIn;
    }
    
    public void setStockLevel(int StockLevelIn)
    {
        StockLevel = StockLevelIn;
    }
    
    // 0 none constructor
    public Product()
    {
        ProductID = 1;
        ProductName = "Name";
        Price = 1.11;
        StockLevel = 1;
    }
    
    // 4 all constructor
    public Product (int ProductIDIn, String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        ProductID = ProductIDIn;
        ProductName = ProductNameIn;
        Price = PriceIn;
        StockLevel = StockLevelIn;
    }
        // 4 all constructor
    public Product (String ProductNameIn, double PriceIn, int StockLevelIn)
    {
        ProductID = 1; // adding this for a default to avoid a 0
        ProductName = ProductNameIn;
        Price = PriceIn;
        StockLevel = StockLevelIn;
    }
}

/*
Class: Product
Attributes:
•	ProductId (int)
•	ProductName (String)
•	Price (double)
•	StockLevel (int)

Constructors:
Product( ) – 0 Parameters
Product(Everything EXCEPT ProductId) – 3 Parameters
Product(Everything) – 4 Parameters

*/