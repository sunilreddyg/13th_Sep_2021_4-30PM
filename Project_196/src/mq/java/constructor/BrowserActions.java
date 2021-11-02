package mq.java.constructor;

public class BrowserActions
{
	//Constructor of class
	public BrowserActions() 
	{
		System.out.println("All Chrome Paths Has been setup");
	}
	
	//Instant Method [Method define without static specifier]
	public void openbrowser()
	{
		System.out.println("browser is opened");
	}

	public static void main(String[] args)
	{
		
		new BrowserActions().openbrowser();
		
	}

}
