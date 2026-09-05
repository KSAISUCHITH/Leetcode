class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Long,Integer> map = new HashMap<>();
        long currentSum = 0;
        int result = 0;
        long needed = 0;

        map.put(0L,1);

        for (int i = 0;i<nums.length;i++){

            currentSum += nums[i];
            needed = currentSum - k;

            
            result += map.getOrDefault(needed,0);
            
            
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
            


        }
        return result;
        
    }
}