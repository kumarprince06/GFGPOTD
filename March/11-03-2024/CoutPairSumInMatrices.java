import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CoutPairSumInMatrices {
    public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of sqaure matrix and Target value Separated by space: ");
        String input[] = read.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        int mat1[][] = new int[n][n];
        System.out.println("Enter Matrix 1 element separated by space: ");
        for (int i = 0; i < n; i++) {
            input = read.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                mat1[i][j] = Integer.parseInt(input[j]);
            }
        }

        int mat2[][] = new int[n][n];
        System.out.println("Enter Matrix 2 element separated by space: ");

        for (int i = 0; i < n; i++) {
            input = read.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                mat2[i][j] = Integer.parseInt(input[j]);
            }
        }

        Solution ob = new Solution();
        System.out.println(ob.countPairs(mat1, mat2, n, x));
    }
}

// User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
        int pair = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                set.add(mat1[i][j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (set.contains(x - mat2[i][j])) {
                    pair++;
                }
            }
        }

        return pair;
    }
}