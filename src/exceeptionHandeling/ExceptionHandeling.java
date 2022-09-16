package exceeptionHandeling;

public class ExceptionHandeling {
	

	int age;
	
	public static void main(String[] args) {
		ExceptionHandeling exc = new ExceptionHandeling();
		exc = null;
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		int[] arr = new int[3];
		
		try {
			
		int i = 9/3;
		arr[2] = 4;
		exc.age = 90;
		
		}
		
		catch(ArithmeticException e) {
			
			try {
			int j = 9/0;
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
		}
		
		catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("Bye");
		
	}

}
