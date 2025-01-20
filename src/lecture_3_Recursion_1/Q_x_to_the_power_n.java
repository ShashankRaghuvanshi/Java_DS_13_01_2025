package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_x_to_the_power_n {
	
	static Scanner s = new Scanner(System.in);
	
	public static int power(int x, int n) {
		
		if(n == 0) {
			return 1;
		}
		
		if(x == 0) {
			return 0;
		}
		
		return power(x, n-1) * x;
	}

	public static void main(String []args) {
		
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(power(x, n));
	}

}
