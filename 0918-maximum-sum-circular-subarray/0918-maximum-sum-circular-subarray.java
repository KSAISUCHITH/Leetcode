class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int currMin = 0;
        int currMax = 0;
        int total = 0;

        for (int num:nums){

            currMax = Math.max(currMax + num,num);
            currMin = Math.min(currMin+num,num);

            total += num;

            max = Math.max(currMax,max);
            min = Math.min(currMin,min);

            

        }
        if (max < 0){
                return max;
            }
            else{
                return Math.max(max,total-min);
            }
        
    }
}