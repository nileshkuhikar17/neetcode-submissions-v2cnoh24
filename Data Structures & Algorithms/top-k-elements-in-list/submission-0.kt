class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var freq=HashMap<Int,Int>()
        for(i in nums.indices){
           freq[nums[i]] = freq.getOrDefault(nums[i],0) + 1
        }
        var arr=mutableListOf<Pair<Int,Int>>()
        for((key, value ) in freq){
            arr.add(Pair(key,value))
        }
        arr.sortByDescending{it.second}

        val res=IntArray(k)
        for(i in 0 until k){
            res[i]=arr[i].first
        }
        return res
    }
}
