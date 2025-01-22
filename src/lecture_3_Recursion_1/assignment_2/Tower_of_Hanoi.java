package lecture_3_Recursion_1.assignment_2;

import java.util.Scanner;

public class Tower_of_Hanoi {
	
	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
	       
		   if (disks == 0) {
	            return;
	        }
		   
		    // Base case: If there's only one disk, move it from source to destination.
	        if (disks == 1) {
	            System.out.println(source +" " + destination);
	            return;
	        }

	        // Step 1: Move top n-1 disks from source to auxiliary, using destination as auxiliary.
	        towerOfHanoi(disks - 1, source, destination, auxiliary);

	        // Step 2: Move the nth disk from source to destination.
	        System.out.println(source +" "+ destination);

	        // Step 3: Move the n-1 disks from auxiliary to destination, using source as auxiliary.
	        towerOfHanoi(disks - 1, auxiliary, source, destination);
	    }
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n, 'a', 'b', 'c');
	}
}
