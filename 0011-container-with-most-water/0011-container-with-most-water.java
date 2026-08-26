class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int area = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            area = Math.max(CalcArea(height,left,right),area);
            if (height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
    return area;
        
    }

    static int CalcArea(int[] height,int left,int right){
        int width = right - left;
        int h = Math.min(height[left],height[right]);
        return width * h;
    }
}