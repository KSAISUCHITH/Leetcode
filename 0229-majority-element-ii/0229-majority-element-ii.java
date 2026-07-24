class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> major=new ArrayList<>();
        HashMap<Integer,Integer> ans = new HashMap<>();

        for(int num: nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
        }

        for(int key : ans.keySet()){
            if(ans.get(key)>nums.length/3){
                major.add(key);
            }
        }
        return major;
    }
}