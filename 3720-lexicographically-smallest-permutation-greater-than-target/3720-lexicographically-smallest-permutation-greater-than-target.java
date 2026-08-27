class Solution {

    public String lexGreaterPermutation(String s, String target) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < target.length(); i++) {

            int ch = target.charAt(i) - 'a';
            if (count[ch] > 0) {

                count[ch]--;
                ans.append((char) ('a' + ch));

            } else {
                for (int j = ch + 1; j < 26; j++) {

                    if (count[j] > 0) {

                        ans.append((char) ('a' + j));
                        count[j]--;
                        for (int k = 0; k < 26; k++) {
                            while (count[k] > 0) {
                                ans.append((char) ('a' + k));
                                count[k]--;
                            }
                        }

                        return ans.toString();
                    }
                }
                break;
            }
        }


        for (int i = ans.length() - 1; i >= 0; i--) {

            int current = ans.charAt(i) - 'a';

            count[current]++;

            for (int j = current + 1; j < 26; j++) {

                if (count[j] > 0) {

                    StringBuilder result = new StringBuilder();

                    result.append(ans.substring(0, i));

                    result.append((char) ('a' + j));
                    count[j]--;

                    for (int k = 0; k < 26; k++) {
                        while (count[k] > 0) {
                            result.append((char) ('a' + k));
                            count[k]--;
                        }
                    }

                    return result.toString();
                }
            }
        }

        return "";
    }
}