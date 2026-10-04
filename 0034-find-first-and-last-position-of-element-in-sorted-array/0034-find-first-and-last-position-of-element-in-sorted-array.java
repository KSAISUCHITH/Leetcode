class Solution {
    public int[] searchRange(int[] nums, int target) {

        int First = FindFirst(nums,target);
        int Last = FindLast(nums,target);

        return new int[] {First,Last};

        
    }

    private int FindFirst(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while(left<=right){
            int middle = left + (right-left)/2;

            if(nums[middle]==target){
                first = middle;
                right = middle - 1;

            }
            else if(nums[middle]>target){
                right = middle -1;
            }
            else{
                left = middle+1;
            }
        }
            return first;
        }

         private int FindLast(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while(left<=right){
            int middle = left + (right-left)/2;

            if(nums[middle]==target){
                last = middle;
                left = middle + 1;

            }
            else if(nums[middle]>target){
                right = middle -1;
            }
            else{
                left = middle+1;
            }
            
    }
    return last;
        }
}