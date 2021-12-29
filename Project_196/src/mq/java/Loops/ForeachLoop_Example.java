package mq.java.Loops;

public class ForeachLoop_Example {

	public static void main(String[] args) 
	{
		
		String browsers[]= {"chrome","safari","opera"};
		for (String eachbrowser : browsers) 
		{
			System.out.println(eachbrowser);
		}
		
		int num[]= {100,200,300};
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
					{"Newuser4","Newpwd4"},
					{"Newuser5","Newpwd5"},
					{"Newuser6","Newpwd6"},
					{"Newuser7","Newpwd7"},
					{"Arunk","Al123"},
			};
		
		
		
		for (String[] row : userdata) 
		{
			System.out.println(row[0]+"   "+row[1]);
		}
	
		
		
		

	}

}
