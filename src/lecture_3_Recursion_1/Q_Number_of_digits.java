package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_Number_of_digits {
	
	public static int digits(int n) {
		if(n == 0) {
			return 0;
		}
		return digits(n/10)+1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = digits(n);
		System.out.println(ans);
	}

}
