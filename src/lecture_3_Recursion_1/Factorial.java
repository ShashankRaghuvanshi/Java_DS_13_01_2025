package lecture_3_Recursion_1;

public class Factorial {
	
	public static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		int smallAns = n * fact(n-1);
		return smallAns;
	}

	public static void main(String[] args) {
		
		int n = 3;
		int ans = fact(n);
		System.out.println(ans);

	}

}
