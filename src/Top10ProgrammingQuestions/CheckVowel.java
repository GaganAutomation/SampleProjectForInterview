package Top10ProgrammingQuestions;

public class CheckVowel {

	public static boolean checkVowel(String str) {
		
		
		int i;
		char[] ch = str.toCharArray();
		
		for(i=0; i<ch.length-1; i++) {
			
			if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u')) {
				
			return true;
				
			}
			
		}
		
		return false;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(checkVowel("TRPM"));
		
		
	}

}
