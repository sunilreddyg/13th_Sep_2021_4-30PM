package mq.java.instantmethods;

public class Run_InstantMethods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * How to run any public class instant methods
		 * [Instant method declare without static specifier]
		 * 
		 *  => In order to call any public class methods
		 *     we should create object for class
		 *     
		 *     Syntax:-->
		 *     		ClassName obj=new ClassName();
		 *     		obj.methodname():
		 */
		RobotA obj=new RobotA();
		obj.walk();
		obj.run();

	}

}
