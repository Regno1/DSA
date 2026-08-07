class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder a = new StringBuilder();
        String i = strs[0];

        for (int j = 0; j < i.length(); j++) {
            for (int k = 1; k < strs.length; k++) {

                if (j >= strs[k].length()) {
               return a.toString();
                }
                    

                    if (i.charAt(j) != strs[k].charAt(j)) {
                        return a.toString();
                    }
            }
            a.append(i.charAt(j));
        }


        return a.toString();
    }
}