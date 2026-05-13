class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     var prevMap=HashMap<Int,Int>()
     for((i,n) in nums.withIndex()){
        var diff=target-n
        if(prevMap.containsKey(diff)){
            return intArrayOf(prevMap[diff]!!,i)
        }
        prevMap[n]=i
     }
     return intArrayOf()
    }
    
}
