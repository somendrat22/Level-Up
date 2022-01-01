// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

// When input is sorted always prefer Two Pointer rather than using HashMap, because HM Solution would take O(N) extra SC, so ignore HM Solution
// TC : O(N)
// SC : O(1)

```
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target) return new int[] {left + 1, right + 1};
            else if(sum < target) left++;
            else right--;
        }
        return new int[0];
    }
}
```
-------------------------------------------------------------
