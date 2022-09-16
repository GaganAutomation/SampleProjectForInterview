package oop_inheritance;

public class Audi extends Car{
	
	@Override
	public void start() {
		System.out.println("Audi--start");
	}
	@Override
	public void stop() {
		System.out.println("Audi--stop");
	}
	@Override
	public void refuel() {
		System.out.println("Audi--refuel");
	}
	
	public void aerodynamic() {
		System.out.println("Audi--aerodynamic");
	}
	
	

}
