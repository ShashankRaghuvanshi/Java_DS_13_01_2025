package lecture_3_Recursion_1;

public class Check_if_array_is_sorted {
	
	public static boolean checkSorted(int input[]) {
		
		if(input.length <= 1) {
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i=0; i<input.length-1; i++) {
			smallInput[i] = input[i+1];
		}
		
		boolean smallAns = checkSorted(smallInput);
		if(!smallAns) {
			return false;
		}
		
		if(input[0] < input[1]) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkSorted_2(int input[]) {
		
		
		if(input.length <= 1) {
			return true;
		}
		
		if(input[0] > input[1]) {
			return false;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i=0; i<input.length-1; i++) {
			smallInput[i] = input[i+1];
		}
		
		boolean smallAns = checkSorted(smallInput);
		return smallAns;
//		if(smallAns) {
//			return true;
//		}else {
//			return false;
//		}	
	}

	public static void main(String[] args) {
		
		int input[] = {2,1, 3, 6, 9};
		System.out.println(checkSorted(input));

	}

}
