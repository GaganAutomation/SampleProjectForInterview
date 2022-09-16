package Test;

public class Palindrome {
	
	
	public static void main(String[] args) {
		
		
		int num = 12198;
		String rev = "";
		
		String num1 = String.valueOf(num);
		
		for(int i=num1.length()-1;i>=0;i--) {
			
			rev = rev+num1.charAt(i);
			
		}
		
		System.out.println(rev);
		
//		if(num1.equals(rev)) {
//			System.out.println("it is palindrome");
//		}
//		else {
//			System.out.println("not");
//		}
		
		String result = (num1.equals(rev))?"palindrom":"not";
		
		System.out.println(result);
//		
//
//
//		String name = "Gagan";
//		
//		
//		@BeforeSuite
//		@BeforeTest
//		@BeforeClass
//		@BeforeMethod
//		@Test
//		@AfterMethod
//		@AfterClass
//		@AfterTest
//		@AfterSuite
//		
//		BaseTest
//		HomePage homepage;
//		
//		public HomePage doLogin() {
//			
//			WebDriver driver;
//			
//			try {
//				int num = 9/0; //
//				driver.find // NPE
//			}
//			
//			catch(expe)
//			catch(NPE)
//			
//			return new HomePage();
//		}
		
		
//		int num = 12345;
//		int reminder=0;
//		int rev = 0;
//		
//		while(num>0) {
//			
//			reminder = num % 10;
//			rev = rev*10+reminder;
//			num/=10;
//		}
//		
//		System.out.println(rev);
		
		String str = "Hello Gagan.";
		int counter[] = new int[256];  
		
		for(int i=0;i<str.length();i++) {
			counter[(int) str.charAt(i)]++;  
		}
		
		for(int i=0; i<256; i++) {
			if(counter[i]!=0) {
				System.out.println((char)i+"-->"+counter[i]);
			}
		}
		
		
		
	}

}
