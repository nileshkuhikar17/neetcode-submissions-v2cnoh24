class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
     val freq=HashMap<Int,Int>()
     for(i in nums){
        freq[i]=freq.getOrDefault(i,0)+1 //{[1,1],[2,2],[3,3]}
     }
     val heap=PriorityQueue<Pair<Int,Int>>(compareBy{
        it.first
     })
     for((num,freq) in freq){
        heap.add(Pair(freq,num))
        if(heap.size>k){
            heap.poll()
        }
     }
     val res=IntArray(k)
     for(i in k-1 downTo 0){
        res[i]=heap.poll().second
     }
     return res
    }

}
