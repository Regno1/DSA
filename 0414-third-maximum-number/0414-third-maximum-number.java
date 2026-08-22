class Solution {
    public int thirdMax(int[] nums) {
    int a=Integer.MIN_VALUE;
    int b=Integer.MIN_VALUE;
    int c=Integer.MIN_VALUE;
    int count=0;
    for(int i=0;i<nums.length;i++){
        if(count==0 || nums[i]!=a){
            if(count<2 || nums[i]!=b){
                if(count<3 || nums[i]!=c){
                    if(a<nums[i]){
                        int temp=a;
                        a=nums[i];
                        c=b;
                        b=temp;
                    }if(nums[i]>b && nums[i]<a){
                        int temp=b;
                        b=nums[i];
                        c=temp;

                    }if(nums[i]>c && nums[i]<b){
                        c=nums[i];
                    }

                    count++;
                }
            }
        }
    }
    if(count<3){
        return a;
    }
    return c;
    }
}