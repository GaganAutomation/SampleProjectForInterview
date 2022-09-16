package oop_Abstraction;

public abstract class Page {
	
	
	public Page() {
		System.out.println("Page class -- const");
	}
	
	public void title() {
		System.out.println("Page title");
	}
	
	public void url() {
		System.out.println("Page URL");
	}
	
	public abstract void logo();

}
