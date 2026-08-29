class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        List<int[]> in = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            in.add(new int[]{nums[i], i});
        }

        in.sort((a, b) -> Integer.compare(a[0], b[0]));

        int start = 0;

        while (start < in.size()) {
            int end = start;

            while (end + 1 < in.size() &&
                   in.get(end + 1)[0] - in.get(end)[0] <= limit) {
                end++;
            }

            ArrayList<Integer> indices = new ArrayList<>();

            for (int i = start; i <= end; i++) {
                indices.add(in.get(i)[1]);
            }

            Collections.sort(indices);

            for (int i = 0; i < indices.size(); i++) {
                nums[indices.get(i)] = in.get(start + i)[0];
            }

            start = end + 1;
        }

        return nums;
    }
}