package interviewQuestion;

public class LeapYearCount {
	
	public static void main(String[] args) {
		
		int from = 2300;
		int to = 2400;
		int count=0;
		
		for(int i=from; i<=to;i++) {
			
			if(i%4==0) 
				if (i%400==0) { 
				
					count++;
				}
			
		}
		
		System.out.println("Total number of leap years from "+from+" to "+to+" is "+count);
		
	}

}
