import java.util.*;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int answer = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add nums[right]
            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);

            // If frequency exceeds k, shrink window
            while (map.get(nums[right]) > k) {

                map.put(nums[left],
                        map.get(nums[left]) - 1);

                left++;
            }

            // Current window length
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}