package lecture_3_Recursion_1.assignment_2;

import java.util.Scanner;

public class Replace_pi_recursive {
	
	public static String replace(String input){
		
		if (input.length() <= 1) {
            return input;
        }

        if (input.charAt(0) == 'p' && input.charAt(1) == 'i') {
            return "3.14" + replace(input.substring(2));
        } else {
            return input.charAt(0) + replace(input.substring(1));
        }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(replace(input));
	}

}
