package Test;

import java.util.HashSet;
import java.util.Random;

public class PrintNumberWithSameNumber {
	
	public static void main(String[] args) {
		
		System.out.println(generate("1674"));
			
		      
		}
		
	
	
	public static int generate(String number) throws NumberFormatException {
	    // 1) parse number and add the digits to a set
	    HashSet<Integer> digits = new HashSet<>();
	    for (String digitStr : number.split("")) {
	        int digit = Integer.parseInt(digitStr);
	        digits.add(digit);
	    }
	    // 2) convert the set to array to access via random index
	    Integer[] digitArray = new Integer[number.length()];
	    digits.toArray(digitArray);

	    String generated = "";
	    Random random = new Random();
	    for (int i=0; i < number.length(); i++) {
	        // 3) grap a random digit from array and append it to your result
	        int randomIndex = Math.abs(random.nextInt()) % number.length();
	        generated += digitArray[randomIndex];
	    }

	    return Integer.parseInt(generated);
	}

}
