package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_Last_index_of_x {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(lastIndex(input, x));
	}
	
	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, 0);
	}

	public static int lastIndex(int input[], int x, int startIndex) {
		
		if (startIndex == input.length) {
    		return -1;
		}

		int smallAns = lastIndex(input, x, startIndex + 1);

		if (smallAns != -1) {
    		return smallAns;
		}

		if (input[startIndex] == x) {
    		return startIndex;
		} else {
    		return -1;
		}
	}

}
