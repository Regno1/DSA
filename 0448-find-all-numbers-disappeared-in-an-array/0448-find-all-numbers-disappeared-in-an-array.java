class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> a= new ArrayList<>();
        Set<Integer> b= new HashSet<>();
        for(int num: nums){
        b.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!b.contains(i)){
                a.add(i);
            }
        }
        return a;
    }
}