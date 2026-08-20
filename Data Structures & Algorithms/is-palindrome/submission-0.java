class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        String str=s.toLowerCase();
        while(i<j){
            if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))){
                i++;
            }
            else if(!Character.isDigit(str.charAt(j)) && !Character.isLetter(str.charAt(j))){
                j--;
            }
            else if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
