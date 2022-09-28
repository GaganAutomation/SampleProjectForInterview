package Test;

public class FindCommonString {
	
	public static void main(String[] args) {
		
		String str = "werVaibhaviop";
		String str1 = "eroVaibhavlpo";
		
		String commonStr = "";
		
		System.out.println(str.length());
		System.out.println(str1.length());
		
		for(int i=0; i<str.length();i++) {
			
			for(int j=i; j<str1.length();j++) {
				
				if(str.charAt(i)==str1.charAt(j)) {
					 commonStr = commonStr+str.charAt(i);
				}
				else {
					break;
				}
			}
			
			continue;
		}
		
		System.out.println("Common String is: "+commonStr);
		
		
		
	}

}
