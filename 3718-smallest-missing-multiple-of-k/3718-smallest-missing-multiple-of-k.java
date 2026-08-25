class Solution {
    public int missingMultiple(int[] nums, int k) {
       int multiple=k;
       while(true){
        boolean a = false;
        for(int num:nums){
            if(num==multiple){
                a=true;
            break;
            }

        }
        if(!a){
            return multiple;
        }
        multiple +=k;
       }
    }
}