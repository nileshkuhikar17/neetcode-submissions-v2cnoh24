class Solution {
    fun isAnagram(s: String, t: String): Boolean {
       if(s.length!=t.length) return false
      val mapS=HashMap<Char,Int>()
      val mapT=HashMap<Char,Int>()

      for(i in s.indices){
        mapS[s[i]]= mapS.getOrDefault(s[i],0)+1
        mapT[t[i]]=mapT.getOrDefault(t[i],0)+1
      }
      if(mapS==mapT){
        return true
      }
      return false
       
    }
}
