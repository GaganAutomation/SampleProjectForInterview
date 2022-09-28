package Test;

public class TestClass {

	
	public static void main(String[] args) {
		
		
		  String string1 = "Gagan deep tyagi";  
	        int count;  
	          
	        //Converts given string into character array  
	        char string[] = string1.toCharArray();  
	          
	        System.out.println("Duplicate characters in a given string: ");
	        //Counts each character present in the string  
	        for(int i = 0; i <string.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j <string.length; j++) {  
	                if(string[i] == string[j] && string[i] != ' ') {  
	                    count++;  
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	            //A character is considered as duplicate if count is greater than 1  
	            if(count > 1 && string[i] != '0')  
	                System.out.println(string[i]);  
	        }  
	        
	        //==========================================================================================//
	        
	        int[] arr = {1,2,4,6,9,10};
	       String result = "";
			
			for(int i=0; i<arr.length;i++) {
				
				if(arr[i]%2!=0) {
				
					result = result+""+arr[i];
			}
				
			
		}
			
			System.out.println(result);
	    
	}
}
			
		
		
//		int[] arr = {1,2,4,6,9,10};
//		
//		for(int i=0; i<arr.length;i++) {
//			
//			if(arr[i]%2==0) {
//				//System.out.println("Even numbers "+ arr[i]);
//			}else
//			{
//				System.out.println("Odd numbers:"+ arr[i]);
//			}
//		}
		
		
//		
//		Select country = new Select();
//		
//		List<WebElement> countryList = country.getoptions();
//		
//		for(WebElement e: countryList) {
//			String text = e.getText();
//			if(text.equals("india")) {
//				e.click;
//				break;	
//			}
//		}
//		


/*
 * rem = num%10;
 * rev = rev*10+rem;
 * num = num/10;
 * 
 * 
 * 
 */
		
		
		
		
		
		
		
	
	


