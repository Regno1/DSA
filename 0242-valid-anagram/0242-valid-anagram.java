class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a= new int[26];
       for(char ch:s.toCharArray()){
        a[ch-'a']++;
       }
       for(char ch:t.toCharArray()){
        a[ch-'a']--;
       }
       boolean allZero= Arrays.stream(a).allMatch(element-> element==0);

       return allZero;
    }
}