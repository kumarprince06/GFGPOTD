import java.util.Scanner;

public class FindTheNthCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary String: ");
        String S = sc.next();
        System.out.println("Enter number of Iteration: ");
        int R = sc.nextInt();
        System.out.println("Enter the index of the character: ");
        int N = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.nthCharacter(S, R, N));

    }

}



//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        // StringBuilder str = new StringBuilder(s);
        
        for(int i=0; i<r; i++){
            String prev ="";
             for(int j = 0; j<s.length(); j++){
                 if(s.charAt(j) == '1'){
                     prev += "10";
                 }else{
                     prev += "01";
                 }
                 if(prev.length() > s.length()){
                     break;
                 }
             }
             s = prev;
        }
        
        return s.charAt(n);
    }
}