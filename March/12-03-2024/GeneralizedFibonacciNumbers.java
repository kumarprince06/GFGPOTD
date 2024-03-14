import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeneralizedFibonacciNumbers {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of a, b, c, n, m: ");
        String S[] = read.readLine().split(" ");

        long a = Long.parseLong(S[0]);
        long b = Long.parseLong(S[1]);
        long c = Long.parseLong(S[2]);
        long n = Long.parseLong(S[3]);
        long m = Long.parseLong(S[4]);

        Solution ob = new Solution();
        System.out.println(ob.genFibNum(a, b, c, n, m));

    }

}



//User function Template for Java

class Solution {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        // code here
         if (n == 1 || n == 2) {
            return 1 % m;
        }
        
        long[][] base = {{a, b, 1}, {1, 0, 0}, {0, 0, 1}};
        long[][] result = power(base, n - 2, m);
        
        long res = (result[0][0] + result[0][1] + result[0][2] * c) % m;
        return res;
        
    }
    
    static long[][] power(long[][] matrix, long exp, long m) {
        
        if(exp == 1){
            return matrix;
        }
        
        long ans[][] = power(matrix, exp/2, m);
        ans = multiply(ans,ans,m);
        if(exp%2 ==1)
            ans = multiply(ans, matrix, m);
            
        return ans;
        
    }
    
    static long[][] multiply(long[][] a, long[][] b, long m) {
        int size = a.length;
        long[][] result = new long[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < size; k++) {
                    result[i][j] = (result[i][j] + (a[i][k]%m * b[k][j]%m)% m)%m;
                }
            }
        }
        
        return result;
    }
    
    // static final int MOD = 1000000007;
}