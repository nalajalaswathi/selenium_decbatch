package javabasics;

public class Stringmethods {

	public static void main(String[] args) {
		
		String str = "Swapna.kumari85@gmail.com";
		
		int counter = 0;
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			
			if(c=='m' || c == 'M')
			{
				counter = counter + 1;
			}
		}		
		System.out.println("count is: " + counter);	
	}
}
