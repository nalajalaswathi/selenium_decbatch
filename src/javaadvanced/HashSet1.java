package javaadvanced;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> SetA = new HashSet<String>();

		SetA.add("element 0");
		SetA.add("element 1");
		SetA.add("element 0");

		//access via Iterator
		Iterator ite= SetA.iterator();
		while(ite.hasNext())
		{
		  String element = (String) ite.next();
		  System.out.println(element);
		}

	}

}
