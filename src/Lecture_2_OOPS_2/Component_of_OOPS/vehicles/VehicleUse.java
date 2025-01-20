package Lecture_2_OOPS_2.Component_of_OOPS.vehicles;

public class VehicleUse {
	
	public static void main(String [] args) {
		Vehicle v = new Vehicle();
		v.color = "Black";
		v.setMaxSpeed(10);
		v.print();
		
		Car c = new Car(999);
//		c.numGears = 10;
		c.color = "Black";
		c.maxSpeed = 1000;
		c.setMaxSpeed(100);
		c.print();
		c.printMaxSpeed();
	}

}
