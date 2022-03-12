
public class Apartment {
	
	//private data members
	private double monthlyRent;
	private int numBedrooms;
	private double numBathrooms;
	private boolean utilitiesIncluded;
	
	
	//1 access modifier (public/private) 2 return value (not here) 3 name 4 parameters
	public Apartment(double monthlyRent, int numBedrooms, double numBathrooms, boolean utilitiesIncluded) {
		//hook up parameters to private data members
		//this. means private data member
		//no this. means its from the parameters
		this.monthlyRent = monthlyRent;
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.utilitiesIncluded = utilitiesIncluded;
		
	}
	
	public Apartment(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	
	//no-arg constructors
	public Apartment() {
		
	}
	
//	public Apartment(double rent, int bed, double bath, boolean util) {
//		//hook up parameters to private data members
//		//this. means private data member
//		//no this. means its from the parameters
//		this.monthlyRent = rent;
//		this.numBedrooms = bed;
//		this.numBathrooms = bath;
//		this.utilitiesIncluded = util;
//		
//	}
	
	
	
	
	
	
	//1. access modifier is public, 2. String is what it returns, 3. name of method is toString
	//4.  parameters are none
	//make "Apartment [monthlyRent=1000.0, numBedrooms=2, numBathrooms=2.0, utilitiesIncluded=false]"
	@Override
	public String toString() {
		return "Apartment [monthlyRent=" + monthlyRent + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", utilitiesIncluded=" + utilitiesIncluded + "]";
	}
	
	
	

}
