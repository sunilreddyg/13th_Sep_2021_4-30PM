package mq.java.Arrays;

public class RuntimeArray_Single_Dimensional {

	public static void main(String[] args)
	{
		
		
		//String array
		String browsers[]= {"chrome","firefox","opera","safari"};
		String browsername=browsers[2];
		System.out.println(browsername);
		
		//Read all array value using foreach loop
		for (String EachBrowser : browsers) 
		{
			System.out.println("=>"+EachBrowser);
		}
		
		
		//integer array
		int num[]= {100,200,300,400,500};
		System.out.println(num[2]);
		
		for (int i : num)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		//Group values
		Object obj[]= {"iphone",250000.00,true,4};
		double productprice=(double) obj[1];
		System.out.println(productprice);
		
		
		for (Object object : obj) 
		{
			System.out.println(object);
			
		}
		
	}

}
