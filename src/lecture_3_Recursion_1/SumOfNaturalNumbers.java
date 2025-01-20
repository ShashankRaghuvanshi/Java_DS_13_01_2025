package lecture_3_Recursion_1;

public class SumOfNaturalNumbers {
	
	public static int printSum(int n) {
		if(n == 1) {
			return 1;
		}
		return n + printSum(n-1);
	}
	
	public static void main(String []args) {
		
		int n = 5;
		int ans = printSum(n);
		System.out.println(ans);
	}

}
