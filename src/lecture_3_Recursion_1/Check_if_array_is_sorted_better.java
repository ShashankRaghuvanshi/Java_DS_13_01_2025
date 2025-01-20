package lecture_3_Recursion_1;

public class Check_if_array_is_sorted_better {

	public static boolean checkSortedBetter(int input[], int startIndex) {
		
		if (startIndex >= input.length-1) {
            return true;
        }

	    if (input[startIndex] > input[startIndex+1]) {
	    	return false;
	    }
		return checkSortedBetter(input, startIndex + 1);
	}
	
	private static boolean checkSortedBetter(int input[]) {
		return checkSortedBetter(input, 0);
	}

	public static void main(String[] args) {
		
		int input[] = {2, 1, 3, 6, 9};
		System.out.println(checkSortedBetter(input));

	}

}
