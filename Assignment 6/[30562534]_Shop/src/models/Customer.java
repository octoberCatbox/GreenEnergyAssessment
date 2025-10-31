
package models;

import java.util.HashMap;

/* Class: Customer (inherits from User)
Private Attributes:
	addressLine1 - String
	addressLine2 - String
	town - String
	postcode - String
	isRegistered - boolean
Constructors:
	Customer()
	Customer(Everything EXCEPT isRegistered - 8 parameters)

Create Attributes, Getters, Setters and Constructors
Comment your code */

public class Customer extends User // Customer child of User

{
	// Attributes
	
    private String addressLine1;
    private String addressLine2;
    private String town;
    private String postcode;
    private boolean isRegistered;
    private HashMap<Integer, Order>orders;
    
    // getter and setter for hashmap here
    public HashMap<Integer, Order> getOrders()
    {
        return orders;
    }
    
    public void setOrders(HashMap<Integer, Order>ordersIn)
    {
        orders = ordersIn;
    }

    // constructor 0
    public Customer()
    {
    	super();
    	addressLine1 = "testAddressLine1";
    	addressLine2 = "testAddressLine2";
    	town = "testtown";
    	postcode = "testpostcode";
    	isRegistered = false;
        orders = new HashMap();
    }

    // overloaded constuctor
    // public User(String UsernameIn, String PasswordIn, String FirstNameIn, String LastNameIn)
    public Customer(String UsernameIn, String PasswordIn, String FirstNameIn, String LastNameIn, String addressLine1In, String addressLine2In, 
                        String townIn, String postcodeIn)
        {
            super(UsernameIn, PasswordIn, FirstNameIn, LastNameIn); // inheritance
            addressLine1 = addressLine1In;
            addressLine2 = addressLine2In;
            town = townIn;
            postcode = postcodeIn;
            isRegistered = false; // initializing a value here
            orders = new HashMap();
        }


    // getters

    public String getAddressLine1()
    {
    	return addressLine1;
    }

    public String getAddressLine2()
    {
    	return addressLine2;
    }

    public String getTown()
    {
    	return town;
    }

    public String getPostcode()
    {
    	return postcode;
    }

    public boolean getIsRegistered()
    {
    	return isRegistered;
    }

    // setters

    public void setAddressLine1(String addressLine1In)
    {
    	addressLine1 = addressLine1In;
    }

    public void setAddressLine2(String addressLine2In)
    {
    	addressLine2 = addressLine2In;
    }

    public void setTown(String townIn)
    {
    	town = townIn;
    }

    public void setPostcode(String postcodeIn)
    {
    	postcode = postcodeIn;
    }

    public void setIsRegistered(boolean isRegisteredIn)
    {
    	isRegistered = isRegisteredIn;
    }

}
