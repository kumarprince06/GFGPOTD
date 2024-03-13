import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapTheArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array size: ");
        int n = Integer.parseInt(br.readLine().trim());
        System.out.println("Enter array element: ");
        String[] S = br.readLine().trim().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(S[i]);
        }
        Solution obj = new Solution();
        obj.swapElements(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


//User function Template for Java

class Solution
{
    public void swapElements(int[] arr, int n)
    {
        // Code here
        if(n < 3){
            return;
        }
        for(int i = 0; i<n-2; i++){
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }
}
