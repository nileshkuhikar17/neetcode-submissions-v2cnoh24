class Solution {
    public boolean isPalindrome(String s) {
       int left=0;
       int right=s.length()-1;
       while(left<right){
        while(left<right && !isAlphaNumeric(s.charAt(left))){
             left++;
         }
        while(left<right && !isAlphaNumeric(s.charAt(right))){
            right--;
        }

        if(s.toLowerCase().charAt(left)!=s.toLowerCase().charAt(right)){
            return false;
        } 
        left++;
        right--;
       } 

       return true;
    }
    public boolean isAlphaNumeric(char ch){
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9') ){
            return true;
        }
        return false;
    }
}
