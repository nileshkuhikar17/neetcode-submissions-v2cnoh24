class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length!=t.length) return false
            val sSorted=s.toCharArray().sorted()
            val tSorted=t.toCharArray().sorted()
            for(i in 0 until sSorted.size){
             if(sSorted[i] != tSorted[i]){
                return false
            }
        }
        return true
    }
}
