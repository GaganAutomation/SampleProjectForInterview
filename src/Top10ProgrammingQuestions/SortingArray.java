package Top10ProgrammingQuestions;

public class SortingArray {
	
	public static char[] sortArray(String str) {
		int i,j;
	
		char ch[] = str.toCharArray();
		
		for( i=0;i<=ch.length-1;i++) {
			for( j=i+1;j<=ch.length-1;j++) {
				if(ch[i]>ch[j]) {
				char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					System.out.println(ch);
					
				}
				
			}
		}
		
		return ch;
		
		
	}
	
	public static void main(String[] args) {
		
	
		System.out.println(sortArray("12345678900987654321"));
	}

}
