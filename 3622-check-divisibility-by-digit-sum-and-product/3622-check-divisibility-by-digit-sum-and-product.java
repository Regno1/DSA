class Solution {
    public boolean checkDivisibility(int n) {
        boolean a =false;
        int sum=0;
        int pod=1;
        int b=n;
        while(n>0){
            int digit= n%10;
            sum=sum+digit;
            pod=pod*digit;
            n=n/10;
        }
        int ps=sum+pod;
        if(b%ps==0){
            return a=true;
        }
        return a;
    }
}