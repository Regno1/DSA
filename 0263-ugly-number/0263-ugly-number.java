class Solution {
    public boolean isUgly(int n) {
    boolean a=true;
        if(n<=0){
            return false;
        }
        for(int i=2;i<=5;i++){
            if(i!=4){
            while(n%i==0){
                n=n/i;
            }
        }
        }
        return n==1;
    }
}