class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var res=0;
        for(i in 0 until s.length){
            var charSet=HashSet<Char>()
            for(j in i until s.length){
                if(charSet.contains(s[j])){
                    break;
                }
                charSet.add(s[j])
            }
            res=maxOf(res,charSet.size)
        }
        return res
    }
}
