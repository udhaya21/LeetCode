class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for(int i = 1; i < nums.length; i++) {
            int val = target - nums[i];
            if(map.containsKey(val)) {
                result[0] = map.get(val);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
            // for(int j = i + 1; j < nums.length; j++) {
            //     if(nums[i] + nums[j] == target) {
            //         result[0] = i;
            //         result[1] = j;
            //         return result;
            //     }
            // }
        }
        return result;
    }
}