package interviewQuestion;

public class factorial {
	
	public static int fact(int num) {
		
		int fact = 1;
		
		//5 = 5*4*3*2*1 => 120
		
		for(int i=num;i>=1;i--) {
			
			fact = fact * i;
		}
		
		return fact;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(fact(10));
	}

}
