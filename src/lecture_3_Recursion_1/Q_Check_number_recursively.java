package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_Check_number_recursively {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.println(checkNumber(input, x));
	}
	
	public static boolean checkNumber(int input[], int x) {
		return checkNumber(input, 0, x);
		
	}
	public static boolean checkNumber(int[] input, int startIndex, int x) {
		if (startIndex >= input.length) {
            return false;
        }

	    if (input[startIndex] == x) {
	    	return true;
	    }
		return checkNumber(input, startIndex + 1, x);
	}

}
