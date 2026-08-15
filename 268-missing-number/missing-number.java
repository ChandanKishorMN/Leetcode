class Solution {
    public int missingNumber(int[] nums) {
      int n=nums.length;
      int sum= n*(n+1)/2;
      int s2=0;
        for(int j=0;j<=n-1;j++)
            s2+=nums[j];
      return (sum-s2);
    }
}