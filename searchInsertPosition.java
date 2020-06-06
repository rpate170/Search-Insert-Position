class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        
        if (target > nums[r]) {
            return nums.length;
        }
        else if (target < nums[l] || nums.length == 0) {
            return 0;
        }
        else {
            while (l <= r) {
                int mid = l + (r-l)/2;
                if (target == nums[mid]) {
                    return mid;
                }
                else if (target > nums[mid]) {
                    l = mid+1;
                }
                else {
                    r = mid-1;
                }
            }
        }
        return l;
    }
}