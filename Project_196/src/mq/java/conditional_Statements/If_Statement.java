package mq.java.conditional_Statements;

public class If_Statement {

	public static void main(String[] args)
	{
		
		
		/*
		 * if:-->
		 * 		=> If only accept boolean statement.
		 * 		=> If usefull to execute any block of statement.
		 */
		
		System.out.println("Statemennt1");
		
		int Age=21;
		if (Age==18)   //Here == return boolean value
		{
			System.out.println("Statement2");
			System.out.println("Statement3");
			System.out.println("Statement4");
		}
		
		
		
		//Only Single Statement to execute in if statement
		if(Age==18)
			System.out.println("Single statement");
		
		

	}

}
