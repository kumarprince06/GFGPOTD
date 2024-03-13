import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumberFormedFromAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String[] inputLine;
        System.out.println("Enter array Size: ");
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println("Enter array element separated by space: ");
        String[] arr = br.readLine().trim().split(" ");

        String ans = new Solution().printLargest(n, arr);
        System.out.println(ans);
    }
}

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        // Custom comparator to sort strings in descending order
        Comparator<String> customComparator = (s1, s2) -> (s2 + s1).compareTo(s1 + s2);

        // Sort the array using the custom comparator
        Arrays.sort(arr, customComparator);

        // If the largest number is "0", return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings to form the largest number
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }

        return result.toString();
    }
}
