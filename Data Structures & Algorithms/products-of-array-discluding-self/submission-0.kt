class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res=IntArray(nums.size)
        for(i in 0 until nums.size){
            var prod=1
            for(j in 0 until nums.size){
                if(i==j) continue
                prod*=nums[j]
            }
            res[i]=prod
        }
        return res
    }
}
