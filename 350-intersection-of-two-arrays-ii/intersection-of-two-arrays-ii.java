import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Optimization: Ensure nums1 is the smaller array to minimize space
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        // Step 2: Populate the frequency map for the smaller array
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> intersection = new ArrayList<>();
        // Step 3: Match elements using the second array
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1); // Decrease the available frequency
            }
        }
        
        // Convert List back to primitive int array
        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }
        
        return result;
    }
}
