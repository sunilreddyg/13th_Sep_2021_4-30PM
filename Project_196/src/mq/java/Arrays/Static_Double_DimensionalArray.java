package mq.java.Arrays;

public class Static_Double_DimensionalArray 
{

	public static void main(String[] args) 
	{
	
		String data[][]=new String[3][2];

		//Storing first row data
		data[0][0]="arjun";
		data[0][1]="Emp001";
		
		//Storing second row data
		data[1][0]="aakash";
		data[1][1]="Emp002";
		
		//Storing third row data
		data[2][0]="varun";
		data[2][1]="Emp003";
		
		
		String SecondUser=data[1][0];
		System.out.println(SecondUser);
		
		
		
		
		
		
		
		
		
	}

}
