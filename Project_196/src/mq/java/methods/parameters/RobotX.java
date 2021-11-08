package mq.java.methods.parameters;

public class RobotX 
{
	
	public void walk()
	{
		System.out.println("walk Completed in 5 Km Speed");
	}
	
	public void custom_walk1(int km)
	{
		System.out.println("Walk Completed in km speed is --> "+km);
	}
	
	public void custom_walk2(String area,int km)
	{
		System.out.println(area);
		System.out.println(km);
	}
	

	public static void main(String[] args) {
		
		RobotX robot=new RobotX();
		robot.walk();
		
	   //Calling with single parameter
		robot.custom_walk1(8);
		robot.custom_walk1(7);
		
		//Calling with multiple parameter
		robot.custom_walk2("sand", 4);

	}

}
