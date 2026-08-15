class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        PriorityQueue<Integer>minheap=new PriorityQueue<>((a,b)->(map.get(a)-map.get(b)));
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int a:map.keySet()){
            minheap.offer(a);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        int arr[]=new int[k];
        int i=0;
        while(!minheap.isEmpty()){
            arr[i]=minheap.poll();
            i++;
        }
        return arr;
    }
}
