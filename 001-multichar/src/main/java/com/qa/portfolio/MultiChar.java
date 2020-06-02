package com.qa.portfolio;


public class MultiChar {

	/**
	 * For each character in the entered string the method will triplicate
	 * each the character and return the concatenated string.
	 * 
	 * @param input - any string
	 * @return triplicates of each letter from the input
	 */
	
	public static void main(String[] args) {
		System.out.println(multiChar("Help"));
		
		
	}
	public static String multiChar(String input) {
		
		String master = new String();
		// TODO
		for (int i = 0; i < input.length(); i++)
		{
			for (int j = 0; j <3; j++)
			{
			master = master + input.charAt(i); 
			System.out.println(master);
			
			//for (int j = 0; j <3; j++)
			//{
			//	System.out.println(input.charAt(j));
			//}
			
			
		}

		/*for (int i = 0; i < 3; i++)
		{
			System.out.println(input);
			
		}*/
	
		
		return master;
	}

}
