package com.qa.portfolio;

public class AmSearch {



	private int count;
	private String found;

	/**
	 * Returns the number of times "am" appears in a String ignoring case <br>
	 * Only counts "am" if it is not proceeded or followed by another character 
	 * 
	 * @param sentence to search for "am" in
	 * @return the count of "am" words
	 */
	public int amSearch(String sentence) {

        // Creating array of string length 
        char[] ch = new char[sentence.length()]; 
        
     // Copy character by character into array 
        for (int i = 0; i < sentence.length(); i++) { 
            ch[i] = sentence.charAt(i);
			  found = sentence.substring(i,i+2);
			  if (found == "am" )
			  {
				  System.out.println("here");
				  count += 1;
				  System.out.println(count);
			  }
			  System.out.println(found);
			  
			  
            
            //System.out.println(ch[i]);
//            if (ch[i] == 'a' {
//            	count =+1;
//            	System.out.println("am");
//            }        		
//        } 
//		
////		
//		
	        
	   
		
			
        }		
		
		
		return count;
	
	}
}

