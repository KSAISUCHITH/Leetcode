class Solution {
    public int[] rearrangeArray(int[] nums) {

        int p=0;
        int q=0;
        int n=nums.length;
        int[] pos =new int[n/2];
        int[] neg = new int[n/2];

        for(int num: nums){
            if(num>0){
                pos[p++]=num;
            }
            else{
                neg[q++]=num;
            }

        }
        p=0;
        q=0;
        int[] ans=new int[n];

        for(int i=0;i<n;i+=2){
            ans[i]=pos[p++];
            ans[i+1]=neg[q++];
        }

        return ans;
        
    }
}