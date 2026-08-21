class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int n=nums[nums.length-1];
        while(i!=0){
            int temp=i;
            i=n%i;
            n=temp;
        }
        return n;
    }
}