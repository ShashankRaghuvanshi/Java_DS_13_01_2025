package lecture_3_Recursion_1.assignment_2;

import java.util.Scanner;

public class Remove_X {
	
	public static String removeX(String input){
		if (input.length() == 0) {
            return "";
        }
      
        if (input.charAt(0) == 'x') {
            return removeX(input.substring(1));
        } else {
            return input.charAt(0) + removeX(input.substring(1));
        }
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(removeX(input));
	}

}
