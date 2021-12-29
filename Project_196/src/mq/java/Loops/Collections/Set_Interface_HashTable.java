package mq.java.Loops.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface_HashTable {

	public static void main(String[] args) {
		
		
		Set<String> set=new HashSet<String>();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("two");
		set.add("five");
		
		//Remove Single Object Using Name
		set.remove("five");
		
		//Get Size of Collection
		int Count=set.size();
		System.out.println("Total Object Count is --> "+Count);
		
		//Verify Object Contains at collection
		boolean flag=set.contains("five");
		System.out.println("Object available status is --> "+flag);
		
		//Read Next Interator value
		String itr=set.iterator().next();
		System.out.println("Next Iterator value is --> "+itr);
		

		//Verify Collection Empty status
		boolean flag1=set.isEmpty();
		System.out.println("is Collection empty ?.  -->"+flag1);
		
		
		
		//Applying foreach loop to read Collectio Next value
		for (String Eachone : set)
		{
			System.out.println(Eachone);
		}
		
		
		//Read all Collection fo objects using while loop
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext())
		{
			String Each_itr_value=iterator.next();
			System.out.println(Each_itr_value);
		}
		
	}

}
