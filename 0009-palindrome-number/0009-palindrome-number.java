class Solution {
    public boolean isPalindrome(int x) {
       int n = x, r=0,d;
       if (n>=0){
       while (n!= 0){
        d=n%10;
        r= r*10+d;
        n=n/10;
       }
       if (x==r)
       return true;
       else
       return false;
       }
       else
       return false;
        
    }
}