class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=findFirst(nums,target);
        int last=findLast(nums,target);

        return new int[]{first,last};
    }
    public static int findFirst(int[] nums,int target){
        int i=0;
        int n=nums.length-1;
        int a=-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(nums[mid]==target){
                a=mid;
                n=mid-1;
            }else if(nums[mid]>target){
                n=mid-1;
            }else{
                i=mid+1;
            }
        }
        return a;
    }
    public static int findLast(int[] nums,int target){
        int i=0;
        int n=nums.length-1;
        int a=-1;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(nums[mid]==target){
                a=mid;
                i=mid+1;
            }else if(nums[mid]<target){
              i=mid+1;
            }else{
                n=mid-1;
            }
        }
        return a;
    }
}
