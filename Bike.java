package Bike;

public abstract class  Bike {
	String name;
	double price;
	int numWheels;
	boolean hasPedals;
	boolean hasTrainingWheels;
	public void createBike()
	{
		createFrame();
		addWheels();
		addPedals();
		getPrice();
		System.out.print("They cost "+"$"+price);
	}
	public void createFrame()
	{
		System.out.println("Assembling "+ name +"frame ");
	}
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
	public void addPedals()
	{
		if(hasPedals= true)
		{
			System.out.println("Adding pedals");
		}
		else
			System.out.print("");
	}
	public double getPrice()
	{
		return price;
	}
}
