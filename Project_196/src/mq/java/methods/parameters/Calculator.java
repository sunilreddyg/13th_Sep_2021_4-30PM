package mq.java.methods.parameters;

public class Calculator 
{
	//Method without parameters
	public void add()
	{
		int a=300;
		int b=200;
		System.out.println(a+b);
	}
	
	//Method with functional parameters
	public void customAdd(int x, int y)
	{
		int a=x;
		int b=y;
		System.out.println(a+b);
	}
	
	

	public static void main(String[] args) 
	{
		Calculator cal=new Calculator();
		cal.add();
		
		//Calling method with actual values
		cal.customAdd(21,220);
		cal.customAdd(180, 30);

	}

}
