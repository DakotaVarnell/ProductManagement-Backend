package project1package;
import java.util.ArrayList;
import java.util.Iterator;


public class ProjectTester {

	public static void main(String args[])
	{
		Product test = new Product("22", "Fender", "Stratocaster", 222.0, "Guitar", 2, "File Path");
		Product test2 = new Product("23", "Fender", "Jazzmaster", 300.0, "Guitar", 2, "File Path");
		ProductCollection myList = new ProductCollection();
		
	
//		System.out.println(test.getId());
//		System.out.println(test.getName());
//		System.out.println(test.getBrand());
		
		
		myList.addInstrument(test);
		myList.addInstrument(test2);
		
		
		
		System.out.println(myList.toString());
		
		
		
	}

}


