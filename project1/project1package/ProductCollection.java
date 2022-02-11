package project1package;

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
	
	//Parameterized Constructor
	public ProductCollection(String filename)
	{
		this.filename = filename;
	}
	
	//Add new Instrument to our collection
	public void addInstrument(Product p)
	{
		Products.add(p);
	}
	
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
			
		}
		
		return toReturn;
		
	}
	
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
	
//	public Product suggestProduct(Product p)
//	{
//		return null;
//	}
	
	public ProductCollection suggestCollection(Product p)
	{
		Iterator<Product> iter = Products.iterator();
		ProductCollection toSuggest = new ProductCollection();
		Product temp = new Product();
		
		System.out.println("You might also like:");
		
		if(p.getInstrType().equals("Guitar"))
		{
			//If guitar suggest picks or strings
		}
		else if(p.getInstrType().equals("Amp"))
		{
			//If Amp suggest cable
		}
		else if(p.getInstrType().equals("Drums"))
		{
			//if Drums suggest drumsticks
		}
		else if(p.getInstrType().equals("Woodwind"))
		{
			//if woodwind suggest reeds
		}
		else
		{
			//otherwise suggest music stand or metronome
		}
		
		return toSuggest;
	}


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
