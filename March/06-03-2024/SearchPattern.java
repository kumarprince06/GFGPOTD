import java.util.ArrayList;
import java.util.Scanner;

public class SearchPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String s, patt;
        s = sc.nextLine();
        System.out.println("Enter pattern: ");
        patt = sc.nextLine();

        Solution ob = new Solution();

        ArrayList<Integer> res = ob.search(patt, s);

        for (int i = 0; i < res.size(); i++)
            System.out.print(res.get(i) + " ");
        System.out.println();

    }

}

//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
         ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= text.length()-pattern.length() ; i++){
            int k =0;
            while(k < pattern.length() && text.charAt(k+i) == pattern.charAt(k)){
                k++;
            }
            if(k == pattern.length()){
                list.add(i+1);
            }
        }
        return list;
    }
}
    
