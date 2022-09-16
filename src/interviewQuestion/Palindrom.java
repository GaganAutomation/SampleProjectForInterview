package interviewQuestion;



public class Palindrom {

	
	public static void main(String[] args) {
	
	String str = "jajklfd";  
	String rev = "";
	
	
	
	int len = str.length();
	
	System.out.println(len);
	
	for(int i=str.length()-1; i>=0; i--) {
		
		rev = rev + str.charAt(i);
		
	}
	
	if(rev.equals(str)) {
		System.out.println("Yes");
	}else {
		System.out.println("NO");
	}
	
	
	
	
	
	}
	
}
