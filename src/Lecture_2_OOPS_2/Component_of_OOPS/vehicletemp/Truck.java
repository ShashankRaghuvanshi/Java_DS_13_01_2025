package Lecture_2_OOPS_2.Component_of_OOPS.vehicletemp;

import Lecture_2_OOPS_2.Component_of_OOPS.vehicles.Vehicle;

public class Truck extends Vehicle{
	
	int maxLoadingCapacity;
	public void print() {
		super.print();
		System.out.println("Truck capacity :"+ maxLoadingCapacity);
//		System.out.println("Truck color :"+ color);
	}

}
