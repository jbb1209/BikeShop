/*
 * Jonathan Brown 
 * CSCE 247
 * 2/6/2021
 */
package Bike;
// this builds the bike when given name of bike
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
