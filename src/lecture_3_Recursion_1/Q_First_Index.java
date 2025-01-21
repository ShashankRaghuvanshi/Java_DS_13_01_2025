package lecture_3_Recursion_1;

import java.util.Scanner;

public class Q_First_Index {
	
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
		System.out.println(firstIndex(input, x));
	}
	
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, 0, x);
	}

	public static int firstIndex(int input[], int startIndex, int x){
		if(startIndex >= input.length){
			return -1;
		}

		if(input[startIndex] == x){
			return startIndex;
		}
		return firstIndex(input, startIndex+1, x);
	}
	
	

}
