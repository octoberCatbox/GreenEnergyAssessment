
package models;

/**
 *
 * @author 30562534
 * 
 *  * Class: 			OrderLine
Private attributes:	orderLineId - int
			product	- Product
			quantity - int
			lineTotal - double

Constructors:
	OrderLine(everything in parameters)
	OrderLine(everything except lineTotal)
		-lineTotal should be calculated by:
		 multiplying the products price by quantity
  

 */
public class OrderLine 

{
    // attributes
    private int orderLineId;
    private Product productLine;
    private int quantity;
    private double lineTotal;
    
    // getters
    public int getOrderLine()
    {
        return orderLineId;
    }
    
    public Product getProductLine()
    {
        return productLine;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public double getLineTotal()
    {
        return lineTotal;
    }
    
    // setters
    public void setOrderLine(int orderLineIn)
    {
        orderLineId = orderLineIn;
    }
    
    public void setProductLine(Product productLineIn)
    {
        productLine = productLineIn;
    }
    
    public void setQuantity(int quantityIn)
    {
        quantity = quantityIn;
    }
    
    public void setLineTotal(double lineTotalIn)
    {
        lineTotal = lineTotalIn;
    }
    
    // 0 constructor
    public OrderLine()
    {
        orderLineId = 1;
        productLine = new Product();
        quantity = 1;
        lineTotal = 0.1;
    }
    
    // all constructor
    public OrderLine(int orderLineIn, Product productLineIn, int quantityIn, 
            double lineTotalIn)
    {
        orderLineId = orderLineIn;
        productLine = productLineIn;
        quantity = quantityIn;
        lineTotal = lineTotalIn;
    }
    
    // all but lineTotal get's calc'd
    public OrderLine(int orderLineIn, Product productLineIn, int quantityIn)
    {
        orderLineId = orderLineIn;
        productLine = productLineIn;
        quantity = quantityIn;
        lineTotal = productLine.getPrice()*quantity;
    }
}
