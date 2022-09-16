package interviewQuestion;

import java.util.Arrays;

public class ArrayListSum {

	public static void main(String[] args) {
		int[] input = {-4,1,3,5};
		int modifier = 5;
		int[] output = new int[input.length];
		output[0] = input[0] + modifier;
		
		for(int i=1; i< input.length; i++) {
			output[i] = input[i] + output[i-1];
			//System.out.println(output[i]);
		}
		
		System.out.println(Arrays.toString(output));
		int sum = Arrays.stream(output).sum();
		System.out.println(sum);
		
	}
}
