class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        var res=mutableMapOf<String,MutableList<String>>()
        for (s in strs){
            var sortedKey= s.toCharArray().sorted().joinToString("")
            res.getOrPut(sortedKey){mutableListOf()}.add(s)

        }
         return res.values.toList()
    }
   
}
