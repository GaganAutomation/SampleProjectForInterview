package interviewQuestion;

import java.util.Scanner;

public class FindMissingNo {


	public static void main(String[] args) {


		int arr[] = new int[] {1,2,3,4,5,7};
		
	//	System.out.println(arr[1]);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the num, which you want to find.");
		
		int num = sc.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			
			if(num!= arr[i]) {
				
				System.out.println(num+" is missing in array..");
				
			}else {
				
				System.out.println(num + "is present..");
			
			}
		}
		
		sc.close();
		
	}
}
