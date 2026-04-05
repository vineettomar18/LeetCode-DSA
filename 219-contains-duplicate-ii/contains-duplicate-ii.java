class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If already exists → duplicate found within range
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Maintain window size of k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;
    }
}