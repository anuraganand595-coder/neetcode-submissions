class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        int ans=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int len=1;
                while(set.contains(num+len)){
                    len++;
                }
                ans=Math.max(ans,len);
            }
        }
        return ans;
    }
}
