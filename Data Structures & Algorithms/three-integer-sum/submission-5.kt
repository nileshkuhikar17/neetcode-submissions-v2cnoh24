class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = HashSet<List<Int>>()

    nums.sort()
        for(i in nums.indices){
            for(j in i+1 until nums.size){
                for (k in j+1 until nums.size){
                    if(nums[i]+nums[j]+nums[k]==0){
                        res.add(listOf(nums[i],nums[j],nums[k]))
                    }
                }
            }
        }
        return res.map{it.toList()}
    }
}
