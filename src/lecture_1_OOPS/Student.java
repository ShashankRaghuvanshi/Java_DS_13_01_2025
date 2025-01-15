package lecture_1_OOPS;

public class Student {
	public String name;
	private int rollNumber;
	
	public void setRollNumber(int rn) {
		if (rn <= 0) {
			rollNumber = rn;
		}
		
	}
	
	public int getRollNumber() {
		return rollNumber;
	}

}
