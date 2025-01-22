package lecture_3_Recursion_1.assignment_2;

import java.util.Scanner;

public class Pair_Star {
	
	public static String addStars(String s) {
		return addStarsHelper(s);
	}

	private static String addStarsHelper(String input){

		//base case
		if(input.length() <= 1){
			return input;
		}

		//first string
		String firstchar = String.valueOf(input.charAt(0));

		//calculation
		if(input.charAt(0) == input.charAt(1)){
			firstchar = input.charAt(0) + "*";
		}

		//recursion
		String smallAns = addStarsHelper(input.substring(1));


		//combination
		return firstchar + smallAns;

	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(addStars(input));
	}

}
