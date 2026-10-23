

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: Value -> Index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];
            
            // Check if the complement (the number we need) was already seen
            if (map.containsKey(complement)) {
                int i = map.get(complement);
                // Since 'i' was inserted earlier, it is guaranteed to be smaller than 'j'
                return new int[] {i, j};
            }
            
            // Store the current number and its index in the map
            map.put(nums[j], j);
        }
        
        // Fallback return if no solution exists (though the problem guarantees exactly one)
        return new int[] {-1, -1};
    }
}
