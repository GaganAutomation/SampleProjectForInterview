package Top10ProgrammingQuestions;

public class fibonacii {

	
	public static void fibo(int num) {
		
		int a = 0, b = 1;
		int sum = 0;
		
		
		System.out.print(a + " " + b);
		
		while(num>0) {
			
		sum = a + b;	
			
			System.out.print(" "+sum);
			a = b;
			b = sum;
			
			num--;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		fibo(10);
	}
	
	
	
	
}
