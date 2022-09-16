package Top10ProgrammingQuestions;

public class Swap2numberWithout3Variable {
	
	public static void swap(int a, int b) {
		
	 
		  b = a + b ; // 3
		  a = b - a ; // 2
		  b = b - a ; // 1
		  
		 
		
		System.out.println("A is: "+a);
		System.out.println("B is: "+b);
		
	}
	
	public static void main(String[] args) {
		swap(1, 2);
	}

}
