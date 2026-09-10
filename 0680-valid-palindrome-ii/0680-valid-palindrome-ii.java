class Solution {
    public boolean validPalindrome(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        int count =1;

        while(left<=right){

            if(arr[left] != arr[right]){

                return isPalindrome(left+1,right,arr) || isPalindrome(left,right-1,arr);
            }
            left++;
            right--;
              
    }
    return true;

    }
        static boolean isPalindrome(int left,int right,char[] arr)
        {

        while(left<right){
            if(arr[left] != arr[right]){
                return false;
            }
            right--;
            left++;
        }
        return true;
        }
}