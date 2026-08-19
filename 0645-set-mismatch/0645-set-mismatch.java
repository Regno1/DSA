class Solution {
    public int[] findErrorNums(int[] nums) {
     int count=0;
     int miss=0;
     int douplicate=0;
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<nums.length;j++){
             if(i==nums[j]){
            count++;
         }
            }
          if(count<1){
            miss=i;
         }if(count>1){
           douplicate=i;
         }
         count=0;
         }
        
        
        return new int[]{douplicate,miss};
    }
}