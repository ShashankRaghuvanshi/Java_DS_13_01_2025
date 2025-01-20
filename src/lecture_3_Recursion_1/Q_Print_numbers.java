package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_Print_numbers {
	
	public static void print(int n) {
		if(n == 0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		print(n);

	}

}
