import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeekElement {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Array size : ");
        int n = Integer.parseInt(in.readLine().trim());
        System.out.println("Enter Array element sepatated with space: ");
        int[] a = new int[n];
        int[] tmp = new int[n];
        String s[] = in.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
            tmp[i] = a[i];
        }

        int f = 0;
        int A = (new Solution()).peakElement(tmp, n);

        if (A < 0 && A >= n)
            System.out.println(0);
        else {
            if (n == 1 && A == 0)
                f = 1;
            else if (A == 0 && a[0] >= a[1])
                f = 1;
            else if (A == n - 1 && a[n - 1] >= a[n - 2])
                f = 1;
            else if (A >= 0 && A < n && a[A] >= a[A + 1] && a[A] >= a[A - 1])
                f = 1;
            else
                f = 0;
            System.out.println(f);
        }

    }
}

/* Complete the function below */

class Solution {
    // Function to find the peak element
    // arr[]: input array
    // n: size of array a[]
    public int peakElement(int[] arr, int n) {
        // add code here.
        return findPeak(arr, 0, n - 1, n);
    }

    private int findPeak(int[] arr, int low, int high, int n) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if the mid element is a peak
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid])) {
                return mid;
            }

            // If the element to the left of mid is greater, search in the left subarray
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } else { // If the element to the right of mid is greater, search in the right subarray
                low = mid + 1;
            }
        }

        return -1; // This should not be reached for valid inputs
    }
}