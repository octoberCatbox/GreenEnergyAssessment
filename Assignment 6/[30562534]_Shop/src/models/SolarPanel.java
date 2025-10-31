/*
Class:			SolarPanel (inherits from Product)
Private attributes:	wattageOutput - int

Constructors:
	SolarPanel()
	SolarPanel(everything EXCEPT productId - 4 parameters)
	SolarPanel(everything - 5 parameters)	

*Create Attributes, Getters, Setters and Constructors
*Comment your code
 */
package models;


public class SolarPanel extends Product

{
    // attributes
    private int wattageOutput;

    // constructors
    // 0 constructor
    public SolarPanel()
    	{
    		super();
    		wattageOutput = 1;
    	}

    // everything except product ID

    public SolarPanel(String ProductNameIn, double PriceIn, int StockLevelIn, 
						int wattageOutputIn)
    	{
			super(ProductNameIn, PriceIn, StockLevelIn);
			wattageOutput = wattageOutputIn;

   	}

   // everything
    public SolarPanel(int ProductIDIn, String ProductNameIn, double PriceIn, int StockLevelIn, 
						int wattageOutputIn)
    	{
			super(ProductIDIn, ProductNameIn, PriceIn, StockLevelIn);
			wattageOutput = wattageOutputIn;

   	}



    //getters and setters

    public int getWattageOutput()
    {
    	return wattageOutput;
    }

    public void setWattageOutput(int wattageOutputIn)
    {
    	wattageOutput = wattageOutputIn;
    }



}
