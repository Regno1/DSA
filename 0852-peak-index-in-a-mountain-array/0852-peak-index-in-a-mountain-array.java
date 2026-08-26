class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length - 1;

        while (i < n) {
            int mid = i + (n - i) / 2;

            if (arr[mid] < arr[mid + 1]) {
                i = mid + 1;
            } else {
                n = mid;
            }
        }

        return i;
    }
}