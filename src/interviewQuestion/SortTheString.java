package interviewQuestion;

public class SortTheString {
	
	public static void main(String[] args) {
		
		String str = "6786756567587586597898";
	
		char ch[] = str.toCharArray();
		char temp = ' ';
		
		for(int i=0; i<ch.length;i++) {
			for(int j=i+1; j<ch.length;j++) {
				if(ch[j]<ch[i]) {
					
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
				
			}
			
		}
		System.out.println(ch);
		
	}
	
}
