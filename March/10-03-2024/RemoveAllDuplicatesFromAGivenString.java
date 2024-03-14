import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAllDuplicatesFromAGivenString {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENter a String: ");
        String str = br.readLine().trim();

        String ans = new Solution().removeDuplicates(str);
        System.out.println(ans);

    }

}

//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        
        String STRING ="";
        Set<Character> chrs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
        {
            chrs.add(str.charAt(i));
        }
        for(Character c : chrs)
        {
            STRING+=c;
        }
        return STRING;
    }
}
