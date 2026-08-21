class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> a=new ArrayList<>();
        int b=Integer.MIN_VALUE;

        for(int i=0;i<candies.length;i++){
            b=Math.max(b,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            candies[i]+=extraCandies;
            if(candies[i]>=b){
                a.add(true);
            }else{
                a.add(false);
            }
        }
        return a;
    }
}