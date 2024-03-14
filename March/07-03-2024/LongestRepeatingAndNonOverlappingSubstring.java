import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * LongestRepeating&NonOverlappingSubstring
 */
public class LongestRepeatingAndNonOverlappingSubstring {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Strng Length: ");
        int N = Integer.parseInt(read.readLine());
        System.out.println("Enter String: ");
        String S = read.readLine();

        Solution ob = new Solution();
        System.out.println(ob.longestSubstring(S, N));

    }
}



//User function Template for Java

class Solution {
    static String longestSubstring(String s, int n) {
        // code here
        int nax = 0, i = 0, j = 0;
        String out = "-1";
        for (; i < n && j < n; ++j) {
            String str = s.substring(i, j + 1);
            if (nax < str.length() && s.indexOf(str, j + 1) != -1) {
                nax = str.length();
                out = str;
            } else {
                ++i;
            }
        }
        return out;
    }
}