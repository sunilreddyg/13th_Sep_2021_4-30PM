package mq.java.Arrays;

public class Static_Single_DimensionalArray {

	public static void main(String[] args) {
		
		
		//Set of stored characters
		String browsers[]=new String[4];
		browsers[0]="chrome";
		browsers[1]="firefox";
		browsers[2]="safari";
		browsers[3]="Opera";
		
		String browsername=browsers[2];
		System.out.println(browsername);
		System.out.println("number of object available is --> "+browsers.length);
		
		
		//Integer array
		int num[]=new int[3];
		num[0]=100;
		num[1]=200;
		num[2]=300;
		
		int val=num[1];
		System.out.println(val);
		System.out.println("integer object count is --> "+num.length);
		
		
		//Group Value
		Object obj[]=new Object[4];
		obj[0]="iphone";
		obj[1]=3;
		obj[2]=50000.00;
		obj[3]=true;
		
		
		String productname=(String) obj[0];
		int prodcutcount= (int) obj[1];
		double prodcutprice=(double) obj[2];
		boolean productstatus=(boolean) obj[3];
		
		System.out.println(productname+"\t"+prodcutcount+"\t"+prodcutprice+"\t"+productstatus);
		
		
		
		
		
		
		
	}

}
