package lecture_3_Recursion_1.assignment;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Geometric_Sum {
	
	public static double findGeometricSum(int k) {
        // Base Case: If k == 0, return 1 (first term of the series)
        if (k == 0) {
            return 1;
        }

        // Recursive Case: Add the current term and recurse for k - 1
        return 1 / Math.pow(2, k) + findGeometricSum(k - 1);
    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		double ans = findGeometricSum(k);
		DecimalFormat dec = new DecimalFormat("#0.00000");
		System.out.println(dec.format(ans));
	}

}
