class Solution {
    fun isPalindrome(s: String): Boolean {
        var arr=s.toCharArray()
        var left=0
        var right=s.length-1

        while(left<right){
            while(left<right && !arr[left].isLetterOrDigit()){
                left++
            }
            while(right>left && !arr[right].isLetterOrDigit()){
                right--
            }
            if(arr[left].lowercase()!=arr[right].lowercase()) return false
            left++
            right--
        }
        return true
    }
}
