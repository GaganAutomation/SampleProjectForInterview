package interviewQuestion;

public class CountTheOccurance {

	public static void main(String[] args) {
		
		int count = checkOccurance('i', "hiiiiiiii thiiiiis iiiiis my iindiia and i love my india i live in india");

		
		System.out.println("Number of occurance of i is: " +count);
	}

	public static int checkOccurance(char c, String str) {
		
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == c) {

				count++;
			}

		}
		
		return count;

	}
}
