package mq.java.Variables;

public class Variables
{
	//Global Variable [Instant Variable]
	int a=100;
	String email="info.dsnr@gmail.com";
	
	//Global Variables [Class Variables/ Static Variables]
	static int b=200;
	static String name="mindq dnsr";
	
	
	public void method1()
	{
		int c=300;   //Local Variable [Variable declared inside method blog]
	}
	
	public static void main(String args[])
	{
		
		//Calling Instant Variables
		Variables var=new Variables();
		int x=var.a;
		System.out.println(x);
		System.out.println(var.email);
		

		//Calling static variables
		System.out.println(Variables.b);
		System.out.println(Variables.name);
		
	}
	
	
	
}
