package project1package;
import java.util.ArrayList;
import java.util.Iterator;


public class ProjectTester {

	public static void main(String args[])
	{
		
		//Add all of our tester products
		Product test = new Product("22", "Stratocaster", "Fender", 222.0, "Guitar", 2, "File Path");
		Product test2 = new Product("23", "Jazzmaster", "Fender", 300.0, "Guitar", 2, "File Path");
		Product test3 = new Product("33", "Les Paul", "Gibson", 300.0, "Guitar", 2, "File Path");
		Product test4 = new Product("38", "Blues Junior", "Fender", 400.0, "Amp", 2, "File Path");
		Product test5 = new Product("36", "Katana", "Boss", 350.0, "Amp", 2, "File Path");
		Product test6 = new Product("39", "Thin Picks", "Tortex", 7.0, "Pick", 2, "File Path");
		Product test7 = new Product("42", "Thick Gauge", "Fender", 12.0, "Strings", 2, "File Path");
		Product test8 = new Product("58", "Tube Screamer", "Ibanez", 12.0, "Pedal", 2, "File Path");
		Product test9 = new Product("44", "Metronome", "Boss", 12.0, "Metronome", 2, "File Path");
		
		//Init our inventory collection class
		ProductCollection myList = new ProductCollection();
		
		//Init with our file name
		//ProductCollection myList = new ProductCollection("./inventoryTest.txt");
		
		//read from our txt file
		//myList.toRead();

		
		//Check our getters
//		System.out.println(test.getId());
//		System.out.println(test.getName());
//		System.out.println(test.getBrand());
		
		//add all the products to the product collection myList
		myList.addInstrument(test);
		myList.addInstrument(test2);
		myList.addInstrument(test3);
		myList.addInstrument(test4);
		myList.addInstrument(test5);
		myList.addInstrument(test6);
		myList.addInstrument(test7);
		myList.addInstrument(test8);
		myList.addInstrument(test9);
		
		
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
		System.out.println(myList.suggestCollection(test2));
		
		//Print out the collection again including all changes
		//System.out.println(myList.toString());
		
		//Write to our text file at end of run
		//myList.toWrite();
		
		
		
	}

}


