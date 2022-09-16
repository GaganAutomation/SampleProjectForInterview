package interviewQuestion;

public class Fibo {
	
	public static void main(String[] args) {
		
	//	[1,2,3,5,8,13,21]
		
		int a = 1; 
		int b = 2;
//		String series = null;
//		int result = a+b;
		
		System.out.print(a + " " + b);
		
		for(int i = 2; i<= 10; i++) {
			
			int sum = a+b;
			System.out.print(" "+sum);
			a = b;
			b = sum;
			
			
		}
		
	}

}


// Inheritance 
// Abstraction
// polymorphism
// Encapsulation