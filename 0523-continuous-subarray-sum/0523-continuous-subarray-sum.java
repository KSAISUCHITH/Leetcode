class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int prefixSum = 0;

        HashMap <Integer,Integer> map = new HashMap<>();

        for (int i = 0;i<nums.length;i++){
            prefixSum += nums[i];
            int remainder = prefixSum % k;


            if (remainder ==0 && i>=1){
                return true;
            }

            if(map.containsKey(remainder)){
                if(i- map.get(remainder)>=2){
                    return true;
                }
            }
            else{
                map.put(remainder,i);
            }



        }
        return false;
    }
}