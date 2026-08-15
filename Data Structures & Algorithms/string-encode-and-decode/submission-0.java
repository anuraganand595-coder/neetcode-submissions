class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb =new StringBuilder();
        for(String a:strs){
            sb.append(a.length()).append("#").append(a);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String>strs=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));
            j++;
            strs.add(str.substring(j,j+len));
            i=j+len;
        }
        return strs;
    }
}
