/*
 * Jonathan Brown 
 * CSCE 247
 * 2/6/2021
 */
package Bike;
// base class for the other bike
public abstract class  Bike {
	String name;
	double price;
	int numWheels;
	boolean hasPedals;
	boolean hasTrainingWheels;
	//creates bike
	public void createBike()
	{
		createFrame();
		addWheels();
		addPedals();
		getPrice();
		System.out.print("They cost "+"$"+price);
	}
	// prints out frame
	public void createFrame()
	{
		System.out.println("Assembling "+ name +"frame ");
	}
	//prints out wheels
	public void addWheels()
	{
		if (numWheels != 0)
		{
			
			if(numWheels == 1)
			{
				System.out.print("Adding "+numWheels+" Wheel ");
			}
			if(hasTrainingWheels == true)
			{
				System.out.println("Adding "+numWheels+" Wheels ");
				System.out.println("Adding Training Wheels ");
			}
			else 
				System.out.print("");
				
			System.out.println("Adding "+numWheels+" Wheels ");
		}
		else
			System.out.print("");
	}
	// prints out pedals
	public void addPedals()
	{
		if(hasPedals= true)
		{
			System.out.println("Adding pedals");
		}
		else
			System.out.print("");
	}
	// return cost of bike
	public double getPrice()
	{
		return price;
	}
}
