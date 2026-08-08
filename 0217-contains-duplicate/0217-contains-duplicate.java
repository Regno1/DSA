class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean a=false;
    
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                a=true;
            }else{
                set.add(nums[i]);
            }
        }
        
        
        return a;
    }
}