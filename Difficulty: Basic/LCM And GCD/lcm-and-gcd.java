//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long a, Long b) {
        // code here
        Long lcm, gcd;
        Long x = a; Long y = b;
        while(x>0 && y>0){
            if(x>y) x = x%y;
            else y = y%x;
        }
        if(x==0){
            gcd = y;
        }
        else{
            gcd = x;
        }
        lcm = (a*b)/gcd;
        return new Long[]{lcm,gcd};
        
    }
};