class Solution {
    static int pivotSortedIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] <= arr[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
    static int binarySearch(int[] nums, int start, int end, int target) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = pivotSortedIndex(nums);
        if (pivotIndex == 0) {
            return binarySearch(nums, 0, n - 1, target);
        }

        if (target >= nums[0] && target <= nums[pivotIndex - 1]) {
            return binarySearch(nums, 0, pivotIndex - 1, target);
        }
        return binarySearch(nums, pivotIndex, n - 1, target);
    }
}