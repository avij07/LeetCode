class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int r = 0;
        while(num!=0){
        int d = num%10;

        if(r>(Integer.MAX_VALUE - d)/10){
            return 0;
        }
        r= r*10+d;
        num/=10;
        }
    return (x<0) ? (-r) : r;      
    }
}