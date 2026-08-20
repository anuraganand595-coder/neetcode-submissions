class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int maxm=0;
        while(i<j){
            if(heights[i]<heights[j]){
                maxm=Math.max(maxm,Math.min(heights[i],heights[j])*(j-i));
                i++;
            }
            else if(heights[i]>heights[j]){
                maxm=Math.max(maxm,Math.min(heights[i],heights[j])*(j-i));
                j--;
            }
            else{
                maxm=Math.max(maxm,Math.min(heights[i],heights[j])*(j-i));
                i++;
                j--;
            }
        }
        return maxm;
    }
}
