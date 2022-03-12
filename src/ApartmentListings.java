
public class ApartmentListings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apartment a1 = new Apartment(1000, 2, 2, false);
		
		Apartment a2 = new Apartment(2000, 5, 1, true);
		
		Apartment a3 = new Apartment(1500, 2, 2, false);
		
		Apartment a4 = new Apartment(5000);
		
		Apartment a5 = new Apartment();
		
		//assumes to_String has been added to class
		System.out.println(a1);
		
		//this is exactly the same but I am explicitly calling to_String
		System.out.println(a1.toString());
		//System.out.print("Apartment [monthlyRent=1000.0, numBedrooms=2, numBathrooms=2.0, utilitiesIncluded=false]")
		
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());

	}

}
