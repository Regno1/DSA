class Solution {
    public boolean sumGame(String num) {

        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;

        int half = num.length() / 2;
        for (int i = 0; i < half; i++) {
            char c = num.charAt(i);

            if (c == '?') {
                leftQ++;
            } else {
                leftSum += c - '0';
            }
        }
        for (int i = half; i < num.length(); i++) {
            char c = num.charAt(i);

            if (c == '?') {
                rightQ++;
            } else {
                rightSum += c - '0';
            }
        }
        int total=leftQ+rightQ;
        if(total%2==1){
            return true;
        }
        int left= 2*leftSum+9*leftQ;
        int right=2*rightSum+9*rightQ;

        if(left==right){
            return false;
        }
         return true;   
        
        
    }
}