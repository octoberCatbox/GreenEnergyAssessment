
package models;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author 30562534
 * 
* Class:			Order
Private attributes:	orderId - int
			orderDate - Date
			orderTotal - double
			status - String
			orderLines - HashMap of orderLines

Constructors:
	Order() - setting orderDate to new Date()
		  and orderLines to a new HashMap
	Order(everything except orderLines) -
		  setting orderLines to a new HashMap 

*Create Getters and Setters for all attributes
 */
public class Order 

{
    private int orderId;
    private Date orderDate;
    private double orderTotal;
    private String status;
    private HashMap<Integer, OrderLine>orderLines;
    
    // getters
    public int getOrderId()
    {
        return orderId;
    }
    
    public Date getOrderDate()
    {
        return orderDate;
    }
    
    public double getOrderTotal()
    {
        return orderTotal;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public HashMap<Integer, OrderLine> getOrderLines()
    {
        return orderLines;
    }
    
    // setters
    
    public void setStatus(String statusIn)
    {
        status = statusIn;
    }
    
    public void setOrderId(int orderIdIn)
    {
        orderId = orderIdIn;
    }
    
    public void setOrderDate(Date orderDateIn)
    {
        orderDate = orderDateIn;
    }
    
    public void setOrderTotal(double orderTotalIn)
    {
        orderTotal = orderTotalIn;
    }
    
    public void setOrderLines(HashMap<Integer, OrderLine>orderLinesIn)
    {
        orderLines = orderLinesIn;
    }
    
    // Order() - setting orderDate to new Date() and orderLines to a new HashMap
    public Order()
    {
        orderId = 1;
        orderDate = new Date();
        orderTotal = 0.1;
        status = "test";
        orderLines = new HashMap();
    }
    
    // Order(everything except orderLines) - setting orderLines to a new HashMap
    public Order(int orderIdIn, Date orderDateIn, double orderTotalIn, String statusIn)
    {
        orderId = orderIdIn;
        orderDate = orderDateIn;
        orderTotal = orderTotalIn;
        status = statusIn;
        orderLines = new HashMap();
    }
    
}
