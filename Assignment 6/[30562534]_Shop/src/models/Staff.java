/*
Class: Staff (inherits from User)
Private Attributes:
	position - String
	salary - double
Constructors:
	Staff()
	Staff(Everything - 6 parameters)


*Create Attributes, Getters, Setters and Constructors
*Comment your code

 */
package models;


public class Staff extends User // inheritance

{
	// attributes
	private String position;
	private double salary;

	// constructors
	// 0 constructor
	public Staff()
	{
		super();
		position = "testposition";
		salary = 0.1;
	}

	// overloaded constructor (everything)
	// public User(String UsernameIn, String PasswordIn, String FirstNameIn, String LastNameIn)
	public Staff(String UsernameIn, String PasswordIn, String FirstNameIn, String LastNameIn,
					String positionIn, double salaryIn)
		{
			super(UsernameIn, PasswordIn, FirstNameIn, LastNameIn);
			position = positionIn;
			salary = salaryIn;
		}


	// getters

	public String getPosition()
	{
		return position;
	}

	public double getSalary()
	{
		return salary;
	}

	// setters

	public void setPosition(String positionIn)
	{
		position = positionIn;
	}

	public void setSalary(double salaryIn)
	{
		salary = salaryIn;
	}

    
}
