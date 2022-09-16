package oop_Abstraction;

public class PageTest {

	public static void main(String[] args) {

		LoginPage login = new LoginPage();
		login.title();
		login.url();
		login.logo();
		
		Page p = new RegisterPage();
		p.title();
		p.url();
		p.logo();
		
		
	}

}
