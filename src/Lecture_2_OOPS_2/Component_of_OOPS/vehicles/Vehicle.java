package Lecture_2_OOPS_2.Component_of_OOPS.vehicles;

public class Vehicle {
	protected String color;
	private int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle construction");
	}
	
	public void print() {
		System.out.println("Vehicle Color :" + color);
		System.out.println("Vehicle Speed :" + getMaxSpeed());
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}
