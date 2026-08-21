class Solution {
    public int maxProfit(int[] prices) {
        int minm=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(minm>prices[i]){
                minm=prices[i];
            }
            else{
                int profit=prices[i]-minm;
                maxprofit=Math.max(maxprofit,profit);
            }
        }
        return maxprofit;
    }
}
