import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);

        find(candidates, target, 0, new ArrayList<>(), ans);

        return ans;
    }

    public void find(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            // Skip duplicate elements
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            // No need to continue if current number is greater than target
            if (arr[i] > target) {
                break;
            }

            list.add(arr[i]);

            // Move to next index (each element is used only once)
            find(arr, target - arr[i], i + 1, list, ans);

            // Backtrack
            list.remove(list.size() - 1);
        }
    }
}