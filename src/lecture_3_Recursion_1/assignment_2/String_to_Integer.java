package lecture_3_Recursion_1.assignment_2;

import java.util.Scanner;

public class String_to_Integer {
	public static int convertStringToInt(String input) {
        // Start the recursive process from index 0
        return convertHelper(input, input.length());
    }
    private static int convertHelper(String input, int length) {
        // Base case: If the string has only one character, return its numeric value
        if (length == 1) {
            return input.charAt(0) - '0';
        }

        // Recursive case:
        // Get the first digit's numeric value
        int firstDigit = input.charAt(0) - '0';

        // Find the value of the remaining substring
        int smallerNumber = convertHelper(input.substring(1), length - 1);

        // Combine the first digit with the smaller number
        return firstDigit * (int) Math.pow(10, length - 1) + smallerNumber;
    }
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(convertStringToInt(input));
	}
}
