package lecture_1_OOPS;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		Student s1 = new Student();
//		System.out.println(s1.name);
//		System.out.println(s1.getRollNumber());
		
		Student s3 = new Student("Ankush", 123);
		s3.print();
//		System.out.println(s3.name);
//		System.out.println(s3.getRollNumber());
		
		Student s4 = new Student("Manisha", 121);
		s4.print();
//		System.out.println(s4.name);
//		System.out.println(s4.getRollNumber());
		
//		Student s5 = new Student("Shashank");
//		s5.print();
		
//		s1.name = "Ankush";
//		s1.setRollNumber(-123);
//		
//		Student s2 = new Student();
//		s2.name = "Manisha";
//		s2.setRollNumber(121);
//		
//		System.out.println(s1.name);
//		System.out.println(s2.name);
//		
//		System.out.println(s1.getRollNumber());
//		System.out.println(s2.getRollNumber());
		//System.out.println(s1);

	}

}
