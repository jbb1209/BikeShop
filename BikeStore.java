package Bike;

public class BikeStore extends Bike {
	public Bike orderBike(String aname)
	{
		Bike bike;
		name = aname;
		if(aname.equals("tricycle"))
		{
			bike = new Tricycle();
		}
		else if (aname.equals("strider"))
		{
			bike = new Strider();
		}
		else 
		{
			bike = new kidsBike();
		}
		 bike.createBike();
		return bike;
			
		
	}
}
