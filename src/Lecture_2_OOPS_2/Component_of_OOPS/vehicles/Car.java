package Lecture_2_OOPS_2.Component_of_OOPS.vehicles;

public class Car extends Vehicle {
	int numGears;
	boolean isConvertible;
	int maxSpeed;
	
	public void print() {
		
		super.print();
		
//		System.out.println("Vehicle Color :" + color);
//		System.out.println("Vehicle Speed :" + getMaxSpeed());
		System.out.println("Vehicle Color :" + numGears);
		System.out.println("Vehicle Speed :" + isConvertible);
	}
	
	public void printMaxSpeed() {
		super.setMaxSpeed(150);
		System.out.println(maxSpeed + " " + super.getMaxSpeed());
	}

}
