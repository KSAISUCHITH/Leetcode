class Solution {
    public int findNumbers(int[] nums) {
        int current=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                current++;
                nums[i]=nums[i]/10;
            }
            if(current%2==0){
                count++;
            }
            current=0;
        }
        return count;
    }
}