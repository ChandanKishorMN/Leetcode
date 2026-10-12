import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
          if(n==1) return nums[0];
            for(int j=1;j<n;j+=2){
                if(nums[j-1]!=nums[j])
                return nums[j-1];
            }
            return nums[n-1];
    }
}