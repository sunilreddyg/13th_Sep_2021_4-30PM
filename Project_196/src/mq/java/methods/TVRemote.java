package mq.java.methods;

public class TVRemote 
{
	
    public void turnon()
	{ 
		System.out.println("turn on executed");
	}
	
	public void turnoff()
	{
		System.out.println("turn off executed");
	}
	
	public void nextchannel()
	{
		System.out.println("Next channel is executed");
	}
	
	public void previouschannel()
	{
		System.out.println("Previous channel is executed");
	}

	public static void main(String args[])
	{
		new TVRemote().turnon();
		new TVRemote().nextchannel();
	}
	
}
