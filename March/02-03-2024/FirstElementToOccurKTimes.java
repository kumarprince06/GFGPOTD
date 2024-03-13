import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * FirstElementToOccurKTimes
 */
public class FirstElementToOccurKTimes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Size of Array: and times number occurs separated by space: ");
        String inputLine[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int k = Integer.parseInt(inputLine[1]);
        System.out.println("Enter array element: ");
        int[] arr = new int[n];
        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(inputLine[i]);

        Solution obj = new Solution();
        System.out.println(obj.firstElementKTime(n, k, arr));

    }
}

class Solution {
    public int firstElementKTime(int n, int k, int[] a) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1);

            // Check if the current element occurs at least k times
            if (frequencyMap.get(a[i]) == k) {
                return a[i];
            }
        }

        return -1; // If no such element is found

    }
}