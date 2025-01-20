package lecture_3_Recursion_1;

import java.util.Scanner;

public class Nth_Fibonacci_number {

	public static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = fibonacci(n);
		System.out.println(ans);
	}

}
