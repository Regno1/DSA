class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           if(i==0){
            a[i]+=nums[i];
            sum=sum+nums[i];
           }else{
            sum=sum+nums[i];
            a[i]=sum;
           }
            
        }
        return a;
    }
}