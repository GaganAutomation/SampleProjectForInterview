package patterns;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			for (int k = 1; k <= i; k++) {
				
				System.out.print(" ");
			}

				for (int j = i; j <= 10; j++) {

					System.out.print(" "+j);
				}

			System.out.println();
		}
		
		for(int i=9; i>=1; i--) {
			
			for(int k=1; k <=i; k++) {
				
				System.out.print(" ");
			}
			
			for (int j = i; j <= 10; j++) {

				System.out.print(" "+j);
			}
			
			System.out.println();
		}

	}

}
