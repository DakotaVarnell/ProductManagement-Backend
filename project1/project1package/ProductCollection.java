package project1package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;




public class ProductCollection {

	private ArrayList <Product> Products;
	private String filename = "";

	
	//Default constructor
	public ProductCollection()
	{
		Products = new ArrayList<Product>();
		filename = null;
	}
	
	//Parameterized Constructor, allows us to read and write
	public ProductCollection(String filename)
	{
		this.filename = filename;
	}
	
	//Add new Instrument to our collection
	public void addInstrument(Product p)
	{
		Products.add(p);
	}
	
	//Find new instrument using inputted id
	public Product findInstrument(String id)
	{
		Iterator <Product> iter = Products.iterator();
		Product toReturn = new Product();
		
		while(iter.hasNext())
		{
			toReturn = iter.next();
			
				if(toReturn.getId().equals(id))
				{
					return toReturn;
				}
				else if(iter.hasNext() != true)
				{
						System.out.println("Item not Found: ");
				}
			
		}
		
		return toReturn;
		
	}
	
	//Update quantity of certain product by using inputted id as if one had been bought
	public Product updateStatus(String id)
	{
		Iterator <Product> iter = Products.iterator();
		Product toReturn = new Product();
		
		while(iter.hasNext())
		{
			toReturn = iter.next();
			
			if(toReturn.getId().equals(id))
			{
				toReturn.setQuantity(toReturn.getQuantity()-1);
			}
		}
		
		return toReturn;
	}
	
	//Return a collection of products by the type of instrument
	public ProductCollection retrieveCollection(String type)
	{
		Iterator<Product> iter = Products.iterator();
		ProductCollection toReturn = new ProductCollection();
		Product temp = new Product();
		
		while(iter.hasNext())
		{
			temp = iter.next();
			
			if(temp.getInstrType().equals(type))
			{
				toReturn.addInstrument(temp);
			}
		}
		
		return toReturn;
	}
	
	//delete an entire product as if it wasn't sold anymore
	public void deleteProduct(String id)
	{
		Iterator <Product> iter = Products.iterator();
		Product toRemove = new Product();
		
		while(iter.hasNext())
		{
			toRemove = iter.next();
			
				if(toRemove.getId().equals(id))
				{
					Products.remove(toRemove);
					break;
				}
		}
	}

	
	//When the instrument or accessory is being bought, suggest a collection that they may also be interested in
	public ProductCollection suggestCollection(Product p)
	{
		Iterator<Product> iter = Products.iterator();
		ProductCollection toSuggest = new ProductCollection();
		Product temp = new Product();
		
		//Title Prompt to tell them what they are looking at
		System.out.println("Since you enjoyed : " + p.getBrand() + " " + p.getName());
		System.out.println("You might also like:");
		
		//else if chain to determine the type of product that was purchased using input p
		if(p.getInstrType().equals("Guitar"))
		{
			//If guitar, suggest picks or strings
			while(iter.hasNext())
			{
				temp = iter.next();
				
				if(temp.getInstrType().equals("Picks") || temp.getInstrType().equals("Strings"))
				{
					toSuggest.addInstrument(temp);
				}
			}
		}
		else if(p.getInstrType().equals("Amp"))
		{
			//If Amp, suggest cable
			while(iter.hasNext())
			{
				temp = iter.next();
				
				if(temp.getInstrType().equals("Cable") || temp.getInstrType().equals("Pedal"))
				{
					toSuggest.addInstrument(temp);
				}
			}
		}
		else if(p.getInstrType().equals("Drums"))
		{
			//If Drums, suggest drumsticks
			while(iter.hasNext())
			{
				temp = iter.next();
				
				if(temp.getInstrType().equals("Drum Sticks"))
				{
					toSuggest.addInstrument(temp);
				}
			}
		}
		else if(p.getInstrType().equals("Woodwind"))
		{
			//If woodwind, suggest reeds
			while(iter.hasNext())
			{
				temp = iter.next();
				
				if(temp.getInstrType().equals("Reeds"))
				{
					toSuggest.addInstrument(temp);
				}
			}
		}
		else
		{
			//otherwise suggest music stand or metronome
			while(iter.hasNext())
			{
				temp = iter.next();
				
				if(temp.getInstrType().equals("Metronome") || temp.getInstrType().equals("Stand"))
				{
					toSuggest.addInstrument(temp);
				}
			}
		}
		
		return toSuggest;
	}
	
	//Method that allows us to read from a text file and input each line as a new product
	public void toRead()
	{
		
			
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filename));
				String line;
				ArrayList temp = new ArrayList();
				
				
				while((line = reader.readLine()) != null)
				{
					//System.out.println(line);
					String[] tokens = line.split(",");
					Product p = new Product(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]),tokens[4], Integer.parseInt(tokens[5]),tokens[6]);
					temp.add(p);
					
				}
				
				Products = temp;
				
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 


	}
		
	//Method that allows us to write to a text file
	public void toWrite(String fn)
	{
			
	}
		
	//To string method that converts this entire collection into a string
	public String toString()
	{
		String toReturn = "";
		Iterator<Product> iter = Products.iterator();
		
		while(iter.hasNext())
		{
			toReturn += iter.next().toString() + "\n";
			
		}
		
		return toReturn;
	}


	
	
	
	
	
	
	
}
