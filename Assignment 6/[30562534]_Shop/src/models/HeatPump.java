/*
Class:			HeatPump (inherits from Product)
Private attributes:	efficiencyRating - double

Constructors:
	HeatPump()
	HeatPump(everything EXCEPT productId - 4 parameters)
	HeatPump(everything - 5 parameters)	

*Create Attributes, Getters, Setters and Constructors
*Comment your code
 */
package models;

public class HeatPump extends Product

{

	// attributes
	private double efficiencyRating;

	// constructors
	// 0 constructor
	public HeatPump()
	{
		super();
		efficiencyRating = 0.1;
	}

	// overloaded constructor (everything except productID)
	// public Product (int ProductIDIn, String ProductNameIn, double PriceIn, int StockLevelIn)

	public HeatPump(String ProductNameIn, double PriceIn, int StockLevelIn, 
						double efficiencyRatingIn)
		{
			super(ProductNameIn, PriceIn, StockLevelIn);
			efficiencyRating = efficiencyRatingIn;
		}

	// overloaded constructor (everything)
	public HeatPump(int ProductIDIn, String ProductNameIn, double PriceIn, int StockLevelIn, 
						double efficiencyRatingIn)
		{
			super(ProductIDIn, ProductNameIn, PriceIn, StockLevelIn);
			efficiencyRating = efficiencyRatingIn;
		}



	// getter and setter

	public double getEfficiencyRating()
	{
		return efficiencyRating;
	}

	public void setEfficiencyRating(double efficiencyRatingIn)
	{
		efficiencyRating = efficiencyRatingIn;
	}
    
}
