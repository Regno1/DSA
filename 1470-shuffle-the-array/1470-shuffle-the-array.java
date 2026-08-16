class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a= new int[nums.length];
        int j=n;
        for(int i=0;i<a.length;i+=2){
            a[i]=nums[i/2];
           
           a[i+1]=nums[j];
           j++;
        }
        return a;
    }
}