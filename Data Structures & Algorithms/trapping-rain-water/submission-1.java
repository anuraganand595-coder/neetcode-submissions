class Solution {
    public int trap(int[] height) {
        if(height.length <=2) return 0;
        int left=-1;
        int amount=0;
        Boolean flag=true;
        for(int i=1;i<height.length;i++){
            if(height[i-1]<=height[i] && left==-1){
                continue;
            }
            if(flag){
                left=i-1;
                flag=false;
            }
            if(height[left]<=height[i]){
                amount+=(Math.min(height[left],height[i])*(i-left-1));
                left++;
                while(left<i){
                    amount-=height[left];
                    left++;
                }
            }
        }

        // from right to left upto left
        int right=-1;
        flag=true;
        for(int i=height.length-2;i>=left;i--){
            if(height[i+1]<=height[i] && right==-1){
                continue;
            }
            if(flag){
                right=i+1;
                flag=false;
            }
            if(height[right]<=height[i]){
                amount+=(Math.min(height[right],height[i])*(right-i-1));
                right--;
                while(right>i){
                    amount-=height[right];
                    right--;
                }
            }
        }
        return amount;
    }
}