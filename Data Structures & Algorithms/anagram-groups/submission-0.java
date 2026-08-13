class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>list=new ArrayList<>();
        HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int arr[]=new int[26];
            for(char ch:strs[i].toCharArray()){
                arr[ch-'a']++;
            }
            String key=Arrays.toString(arr);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else {
                map.put(key,new ArrayList<>(Arrays.asList(strs[i])));
            }
        }
        list.addAll(map.values());
        return list;
    }
}
