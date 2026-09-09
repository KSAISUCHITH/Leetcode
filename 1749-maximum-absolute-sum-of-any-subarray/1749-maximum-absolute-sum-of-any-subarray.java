class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int currMin = 0;
        int currMax = 0;
        int total = 0;

        for (int num:nums){
            currMax = Math.max(currMax+num,num);
            currMin = Math.min(currMin+num,num);
            total+=num;
            min = Math.min(currMin,min);
            max = Math.max(currMax,max);

            
        }
        return Math.max(max,Math.abs(min));
    }
}