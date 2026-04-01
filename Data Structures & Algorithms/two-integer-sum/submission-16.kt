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
    for(i in nums.indices){
        val complement=target-nums[i]
        if(map.containsKey(complement)){
            return intArrayOf(map[complement]!!,i)
        }
        map[nums[i]]=i
    }
    return intArrayOf()
    }
}
