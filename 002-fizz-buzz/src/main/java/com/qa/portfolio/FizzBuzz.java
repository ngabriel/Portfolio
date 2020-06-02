package com.qa.portfolio;

public class FizzBuzz {

	/**
	 * Gives string output of a numeric value by applying the fizzbuzz rules: <br>
	 * <ul>
	 * <li>If the number is divisible by 3 it will return "fizz"</li>
	 * <li>If the number is divisible by 5 it will return "buzz"</li>
	 * <li>If the number is divisible by 3 and 5 it will return "fizzbuzz"</li>
	 * <li>If the number is divisible by neither 3 or 5 it will return the 
	 * value of the the number as a string</li>
	 * </ul>
	 * @param number
	 * @return "fizz", "buzz", "fizzbuzz" or numeric value as a string
	 */
	public String fizzBuzz(int number) {
		String ans = new String();
		if (number %5 ==0 && number %3 == 0)
		{
			ans = "fizzbuzz";
		}
		else if (number%3 == 0)
		{
			ans = "fizz";
		}
		
		else if (number%5 ==0)
		{
			ans = "buzz";
		}
		
		else
		{
			//myString = Integer.toString(myInteger);
			ans = Integer.toString(number);
		}
		
		
		
		
		
		
    	return ans;
	}
}
