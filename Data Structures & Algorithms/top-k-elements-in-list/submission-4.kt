class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map=HashMap<Int,Int>()
        for(num in nums){
            map[num]=map.getOrDefault(num,0)+1
        }
        val arr=mutableListOf<Pair<Int,Int>>()
        for((num,freq) in map){
            arr.add(Pair(freq,num))
        }
        arr.sortByDescending{it.first}

        val res=IntArray(k)
        for(i in 0 until k){
            res[i]=arr[i].second
        }
        return res
    }
}
