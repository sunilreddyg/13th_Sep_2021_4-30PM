package mq.java.Variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class String_Comparision_Commands 
{

	public static void main(String[] args)
	{
		
		
		/*
		 * String:-->
		 * 			=> String store set of characters
		 * 			=> String is not only data type and also called
		 * 				as class, Because string contains set of 
		 * 				events[behaviours] to validate stored characters
		 */
		
	
		/*
		 * Equals:-->
		 * 			=> Method verify equal comparision between two strings
		 * 				and return boolean value true/false.
		 * 
		 * 			Note:--> comparision is case sensitive
		 */
		
		String exp_res="Account Created";
		String act_res="account Created";
		
		boolean flag=exp_res.equals(act_res);
		System.out.println("Equal Comparision is --> "+flag);
		
		
		/*
		 * equalignorecase:-->
		 * 			Method verify equal comparision between two string
		 * 			by ignoring cases sensitive
		 */
		boolean flag1=exp_res.equalsIgnoreCase(act_res);
		System.out.println("Equalignoce case comparision is --> "+flag1);
		
		/*
		 * contains:-->
		 * 			Verify partial sequence characters available at 
		 * 			main string
		 */
		String status="Create 76hjhf98klk  successfull";
		boolean flag3=status.contains("Create");
		System.out.println("Partial characters available status is --> "+flag3);
		
		
		/*
		 * length:-->
		 * 		Method return characters count available at string 
		 * 		with in integer format
		 */
		String mobilenumber="9030248855";
		int len=mobilenumber.length();
		System.out.println("Mobile nuber length is --. "+len);
		System.out.println("integer comparision "+(len==10));
		
		
		/*
		 * substring:-->
		 * 		Method get sub string charcters from main string
		 */
		String AccountNumber="123488881478";
		String LastDigits=AccountNumber.substring(8);
		System.out.println("Last 4 Digits are --> "+LastDigits);
        
		String MiddleChars=AccountNumber.substring(4, 8);
		System.out.println("Middle Characters are ---> "+MiddleChars);
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		boolean flag4=AccountNumber.startsWith("1234");
		System.out.println("Starts With status is ---> "+flag4);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag5=AccountNumber.endsWith("1478");
		System.out.println("Ends with status is --> "+flag5);
		
		
		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());

		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number ---> "+ch);

		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsername.replaceAll("o", "i"));

		String NewList=browsername.replaceAll("Firefox", "Safari");
		System.out.println(NewList);
		
		
		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String New_browser=browsername.concat(",Safari");
		System.out.println(New_browser);
		
		/*
		 * tolowercase:-->
		 * 			Convert all uppercase characters in lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		
		
		/*
		 * toUppercase:-->
		 * 			Convert all lowercase characters in Uppercase
		 */
		System.out.println(toolname.toUpperCase());
		


		/*
		 * trim:--> method trim extra spaces [Only left and Right spaces]
		 */
		String pincode="   500035    ";
		System.out.println("length before trim is --> "+pincode.length());
		String NewPincode=pincode.trim();
		System.out.println("Length after trim is =--> "+NewPincode.length());
		
		

		
		
	}

}
