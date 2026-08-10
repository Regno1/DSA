class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> a=new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        

        for(int i=0;i<nums1.length;i++){
            a.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
              if(a.contains(nums2[j])){
             if(!result.contains(nums2[j])){
              result.add(nums2[j]);
             }
            }
        }
       return result.stream()
             .mapToInt(Integer::intValue)
             .toArray();
    }
}