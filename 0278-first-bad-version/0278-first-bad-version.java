/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i=1;
        int a=0;
        boolean s=false;
        while(i<=n){
    int mid=i+(n-i)/2;
    if(isBadVersion(mid)){
a=mid;
n=mid-1;
    }else{
        i=mid+1;
    }
}    
return a;    
    }
}