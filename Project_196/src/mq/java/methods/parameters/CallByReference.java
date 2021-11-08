package mq.java.methods.parameters;

public class CallByReference 
{
	
	//Method parameter with call by reference
	public void method1(Calculator cal)
	{
		cal.add();
	}
	
	public static void main(String[] args) 
	{
		CallByReference ref=new CallByReference();
		ref.method1(new Calculator());
	}

}
