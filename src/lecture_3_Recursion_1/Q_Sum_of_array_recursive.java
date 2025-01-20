package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_Sum_of_array_recursive {
	
	static Scanner s = new Scanner(System.in);
	
	public static int sum(int[] input, int startIndex) {
	    if (startIndex == input.length) {
	        return 0;
	    }
	    return input[startIndex] + sum(input, startIndex + 1);
	}

	public static int sum(int[] input) {
	   	return sum(input, 0);
	}
	
	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(sum(input));
	}
}
