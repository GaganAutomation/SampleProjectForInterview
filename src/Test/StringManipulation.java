package Test;

public class StringManipulation {
	
	public static void main(String[] args) {
		
		
//		String s = "The order id is 984509324532492034";
//		
//		System.out.println(s.substring(s.indexOf("is")+3, s.length()));
		
		
		int arr[] = {1,2,3,4,6};
		
		int expec_no_of_Ele = arr.length+1;
		int total_sum = expec_no_of_Ele*(expec_no_of_Ele+1)/2;
		
		int sum = 0;
		
		for(int i=0; i<arr.length;i++) {
			
			sum = sum + arr[i];
		}
		
		System.out.println("Missing number is: "+(total_sum-sum));
		
		
		
	}

}
