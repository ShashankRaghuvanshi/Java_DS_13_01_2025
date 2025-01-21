package lecture_3_Recursion_1.assignment;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class Check_Palindrome_recursive {
	
	private static boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (str.charAt(left) == str.charAt(right)) {
            return isPalindromeHelper(str, left + 1, right - 1);
        }

        return false;
    }
    public static boolean isPalindrome(String S) {
        return isPalindromeHelper(S, 0, S.length() - 1);
    }
    
    public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine(), " ");
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t ;
    private static String []str;

    private static void takeInput() {
        t = 1;
        str = new String[t];
        for(int i = 0; i < t; i++){
            str[i] = sc.next();
        }
    }

    private static void execute() {
        for(int i = 0; i < t; i++) {
            isPalindrome(str[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for(int i = 0; i < t; i++){
            boolean ans = isPalindrome(str[i]);
            if(ans)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

    public static void main(String[] args) {
        takeInput();
        executeAndPrintOutput();
        out.close();
    }

}
