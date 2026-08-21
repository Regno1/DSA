class Solution {
    public boolean isPerfectSquare(int num) {
     boolean a=false;
     
        int i=1;
        int n=num;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(mid==num/mid && num%mid==0){
                return a=true;
            }if(mid<num/mid){
                i=mid+1;
            }else{
                n=mid-1;
            }
        }
        return a;
    }
}