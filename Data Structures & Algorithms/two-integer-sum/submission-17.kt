class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
    //Brute Force
    //  for(i in nums.indices){
    //     for(j in i+1 until  nums.size){
    //         if(nums[i]+nums[j]==target){
    //             return intArrayOf(i,j)
    //         }
    //     }
    //  }  
    //  return intArrayOf()
    //HashMap
    val map=HashMap<Int,Int>()
    for((i,n) in nums.withIndex()){
        val diff=target-n
        if(map.containsKey(diff)){
            return intArrayOf(map[diff]!!,i)
        }
        map[n]=i
    }
    return intArrayOf()
    }
}
