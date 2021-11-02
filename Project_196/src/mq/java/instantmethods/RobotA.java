package mq.java.instantmethods;


public class RobotA 
{
	//Instant method
	public void walk()
	{
		System.out.println("Walk is executed");
		stop();
	}
	
	//instant method
	public void run()
	{
		System.out.println("Run is executed");
		stop();
	}
	
	//instant method
	public void stop()
	{
		System.out.println("Stop is executed");
	}
	

	public static void main(String[] args)
	{
		
		RobotA obj=new RobotA();
		obj.walk();
		obj.run();

	}

}
