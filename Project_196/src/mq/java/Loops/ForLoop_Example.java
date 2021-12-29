package mq.java.Loops;

public class ForLoop_Example 
{

	public static void main(String[] args) 
	{
		
		//Print numbers from 1 to 10
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print Number from 20 to 10
		for (int i = 20; i >= 10; i--) 
		{
			System.out.println(i);
		}
		
		
		//Print array values using for loop
		String browsers[]= {"chrome","firefox","safari","opera","edge"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String eachbrowser = browsers[i];
			System.out.println(eachbrowser);
			
		}
		
		int sum=0;
		//Conduct sum between 1 to 100
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("Total value is --> "+sum);
		
		
		//How to reverse a string
		String toolname="linus";
		//Convert sequence characters into character array
		char ch[]=toolname.toCharArray();
		
		String str="";
		for (int i = ch.length-1 ; i >= 0; i--)
		{
			str=str+ch[i];
		}
		System.out.println(str);
		
		
		//How to reverse a string using string builder
		StringBuilder obj=new StringBuilder(toolname);
		System.out.println(obj.reverse());

	}

}
