package oop_inheritance;

public class CarTest extends Vehicle{

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

		// TOP casting...

		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();

		// Down casting..

		//BMW b1 = (BMW) new Car();//ClassCastException
		
		System.out.println("=======================");
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.aerodynamic();
		
		System.out.println("======vehicle========");
		
		Vehicle v = new Vehicle();
		v.start();
		
		
		
	}

}
