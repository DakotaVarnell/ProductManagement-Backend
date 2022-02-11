package project1package;
import java.util.ArrayList;
import java.util.Iterator;


public class ProjectTester {

	public static void main(String args[])
	{
		
		//CHANGE THE BRAND AND NAME SWITCH THEM AROUND
		Product test = new Product("22", "Fender", "Stratocaster", 222.0, "Guitar", 2, "File Path");
		Product test2 = new Product("23", "Fender", "Jazzmaster", 300.0, "Guitar", 2, "File Path");
		Product test3 = new Product("33", "Gibson", "LesPaul", 300.0, "Guitar", 2, "File Path");
		Product test4 = new Product("38", "Fender", "Blues Junior", 400.0, "Amp", 2, "File Path");
		Product test5 = new Product("36", "Boss", "Katana", 350.0, "Amp", 2, "File Path");
		Product test6 = new Product("39", "Tortex", "Thin", 7.0, "Pick", 2, "File Path");
		Product test7 = new Product("42", "Fender", "Heavy Gauge", 12.0, "Strings", 2, "File Path");
		ProductCollection myList = new ProductCollection();
		
	
//		System.out.println(test.getId());
//		System.out.println(test.getName());
//		System.out.println(test.getBrand());
		
		
		myList.addInstrument(test);
		myList.addInstrument(test2);
		myList.addInstrument(test3);
		myList.addInstrument(test4);
		myList.addInstrument(test5);
		myList.addInstrument(test6);
		myList.addInstrument(test7);
		
		
		//Print out the string representation of our collection
		System.out.println(myList.toString());
		
		//Print out an instrument found using its id
		//System.out.println(myList.findInstrument("33"));
		
		//Delete a product according to its id
		//myList.deleteProduct("23");
		
		//Finds a collection of items
		//System.out.println(myList.retrieveCollection("Guitar"));
		
		//Decrease the quantity of an item (Purchase this item)
		//myList.updateStatus("");
		
		//Give the method a product, and then return a list of products
		//that compliment that product
		System.out.println(myList.suggestCollection(test));
		
		//Print out the collection again including all changes
		//System.out.println(myList.toString());
		
		
		
	}

}


