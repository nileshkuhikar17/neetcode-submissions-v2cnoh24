class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
      val n = nums.size
      var res=IntArray(n)
      for(i in 0 until n){
        var prod=1
        for(j in 0 until n){
            if(i==j) continue
            prod=prod*nums[j]
            res[i]=prod
        }
      }
      return res
    }
}
