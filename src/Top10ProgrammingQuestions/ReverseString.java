package Top10ProgrammingQuestions;

public class ReverseString {
	
	public static String reverseString(String str) {
		
		int i = 0;
		String rev = "";
		
		for(i=str.length()-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
		}
		
		return rev;
		
	}
	
	public static void main(String[] args) {
		
	String revString = 	reverseString("GaganDeepTyagi");
	System.out.println(revString);
	}

}
