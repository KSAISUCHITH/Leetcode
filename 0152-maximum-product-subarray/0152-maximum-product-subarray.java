class Solution {
    public int maxProduct(int[] nums) {
        int product = nums[0];
        int CurrentMax = nums[0];
        int CurrentMin = nums[0];

        for(int i = 1;i<nums.length;i++){
            int num = nums[i];

            int NewMax= Math.max(num,Math.max(num*CurrentMax,num*CurrentMin));
            int NewMin = Math.min(num,Math.min(num*CurrentMax,num*CurrentMin));

            CurrentMax = NewMax;
            CurrentMin = NewMin;

            product = Math.max(product,CurrentMax);
        }
        return product;
    }
}