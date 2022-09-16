package interviewQuestion;

public class CountVowel {
	
	public static void main(String[] args) {
		
		int count = 0;
		
		String str = "Hi Dominic how are you";
		
		for(int i=0; i<str.length(); i++) {
			
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')
				         	||(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
				
				count++;
				
			}
			
		}
		
		System.out.println("Total vowels are in the string: "+count);
		
	}

}
