class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
            val res=HashMap<String,MutableList<String>>()
            for(s in strs){
               var sorted=s.toCharArray().sorted().joinToString("")
                if (sorted !in res) {
                res[sorted] = mutableListOf()
             }
    
                res[sorted]!!.add(s)

            }
            return res.values.toList()
    }
}
