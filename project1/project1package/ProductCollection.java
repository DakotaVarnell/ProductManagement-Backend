package project1package;

import java.util.ArrayList;

public class ProductCollection {

	private ArrayList <Product> Products;
	private String filename;

	
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
	
	public Product findInstrument(Product p)
	{
		return null;
	}
	
	//
}
