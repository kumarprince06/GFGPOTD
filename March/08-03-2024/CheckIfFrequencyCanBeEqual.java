import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckIfFrequencyCanBeEqual {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String: ");
        String input[] = read.readLine().split(" ");
        String a = input[0];

        Solution ob = new Solution();
        if (ob.sameFreq(a)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

}



//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        // code here
        int []arr=new int[26];int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch-'a']++;
            max=Math.max(max,arr[ch-'a']);
        }
        
        int count1=0;int count2=0;int count3=0;
        
        //count1 -> no. of characters having the max frequency
        //count2 -> n0. of characters having frequency 1 less than max;
        //count3 -> no. of characters having frequency only 1
     

        for(int i=0;i<26;i++){
            int t=arr[i];
            if(t>0 && max==t)
             count1++;
            else if(t>0 && (max-t)>1)
              return false;
            else if(t>0 && (max-t)==1){
                count2++;
                if(t==1)
                count3++;
            }
            if(count1>1 && count2>0 && count3!=1)
                return false;
        }
     
       return true;
    }
}
