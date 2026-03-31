class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
     val freq=HashMap<Int,Int>()
     for(i in nums){
        freq[i]=freq.getOrDefault(i,0)+1 //{[1,1],[2,2],[3,3]}
     }
     var arr=mutableListOf<Pair<Int,Int>>()
        for((key,value) in freq){
            arr.add(Pair(key,value))
        }
        arr.sortByDescending{ it.second }
        var res=IntArray(k)
        for(i in 0 until k){
            res[i]=arr[i].first
        }
        return res
    }
}
