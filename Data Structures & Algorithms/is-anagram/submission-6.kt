class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length!=t.length) return false
           var sCount=HashMap<Char,Int>()
           var tCount=HashMap<Char,Int>()

           for(i in s.indices){
            sCount[s[i]]=sCount.getOrDefault(s[i],0) + 1
            tCount[t[i]]=tCount.getOrDefault(t[i],0) + 1
           }
        
        return sCount==tCount
    }
 }
    
    
