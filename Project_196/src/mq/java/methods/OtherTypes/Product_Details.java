package mq.java.methods.OtherTypes;

public class Product_Details 
{
	
	
	void printnameofProduct()
	{
		System.out.println("Iphone 13 Pro");
	}
	
	String getProductName()
	{
		String name="Samsung";
		return name;
	}
	
	int getnumberofproducts()
	{
		
		return 10;
	}
	
	/*
	 * => Instead of void all methods return values
	 * => We should write return keyword at the end of the method
	 * => Return value and method type should match
	 * => Finally it return value to method name
	 */
	

	public static void main(String[] args)
	{
		
		Product_Details info=new Product_Details();
		info.printnameofProduct();
		
		String name=info.getProductName();
		System.out.println(name);
		
		int quantity=info.getnumberofproducts();
		System.out.println(quantity);

	}

}
