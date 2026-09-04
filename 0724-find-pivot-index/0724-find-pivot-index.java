class Solution {
    public int pivotIndex(int[] nums) {
        long totalSum = 0;
        long rightSum = 0;
        long leftSum = 0;
        for (int num:nums){
            totalSum += num;
        }

        for(int i = 0;i<nums.length;i++){
            rightSum = totalSum - leftSum - nums[i];
            if (rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}