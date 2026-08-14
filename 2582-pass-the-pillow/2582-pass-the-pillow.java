class Solution {
    public int passThePillow(int n, int time) {
        int t = time % (2 * (n - 1));

        if (t <= n - 1) {
            return t + 1;
        }

        return 2 * n - t - 1;
    }
}