package lecture_1_OOPS;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student s1 = new Student();
		s1.name = "Ankush";
		s1.rollNumber = 123;
		
		Student s2 = new Student();
		s2.name = "Manisha";
		s2.rollNumber = 121;
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		//System.out.println(s1);

	}

}
