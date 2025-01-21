package lecture_3_Recursion_1.assignment;

import java.util.Scanner;

public class Multiplication_Recursive {
	
	public static int multiplyTwoIntegers(int m, int n){
		
		if(m == 0 || n == 0){
			return 0;
		}

		if(n == 1){
			return m;
		}

		return m + multiplyTwoIntegers(m, n-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println(multiplyTwoIntegers(m, n));
	}

}
