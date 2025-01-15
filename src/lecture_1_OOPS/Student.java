package lecture_1_OOPS;

public class Student {
	public String name;
//	private int rollNumber;
	private final int rollNumber;
	
//	public Student() {
//		//default constructor
//	}
	
//	public Student() {
//		rollNumber = 100;
//	}
	
	public Student(String name, int rollNumber) {
		System.out.println(this);
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
//	public Student(String n) {
//		name = n;
//	}
	
//	public Student(String n, int rn) {
//		name = n;
//		rollNumber = rn;
//	}
//	
//	public void setRollNumber(int rn) {
//		if (rn <= 0) {
//			rollNumber = rn;
//		}
//		
//	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void print() {
		System.out.println(name +" "+":"+" "+rollNumber);
	}
}
