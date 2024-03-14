import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * MaximumIndex
 */
public class MaximumIndex {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array: ");
        int n = Integer.parseInt(br.readLine().trim()); // size of array
        int arr[] = new int[n];
        System.out.println("Enter array element separated by space: ");
        String inputLine[] = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
        }

        Solution ob = new Solution();

        System.out.println(ob.maxIndexDiff(arr, n)); // print the result

    }
}

class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        
        // Your code here
        if (n <= 1) {
            return 0;
        }

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // Precompute leftMin array
        leftMin[0] = a[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], a[i]);
        }

        // Precompute rightMax array
        rightMax[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);
        }

        int maxDiff = 0;
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
        
    }
}
