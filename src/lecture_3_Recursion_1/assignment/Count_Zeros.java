package lecture_3_Recursion_1.assignment;

import java.util.Scanner;

public class Count_Zeros {
	
	public static int countZerosRec(int input) {
        // Base Case: If the number is exactly 0, return 1 (to handle input = 0)
        if (input == 0) {
            return 1;
        }

        // Helper function to process numbers greater than 0
        return countZerosHelper(input);
    }

    private static int countZerosHelper(int input) {
        // Base Case: If the number is reduced to 0, stop recursion
        if (input == 0) {
            return 0;
        }

        // Check the last digit
        int lastDigit = input % 10;
        int count = (lastDigit == 0) ? 1 : 0;

        // Recursive Call: Remove the last digit and add the count
        return count + countZerosHelper(input / 10);
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(countZerosRec(n));
	}

}
