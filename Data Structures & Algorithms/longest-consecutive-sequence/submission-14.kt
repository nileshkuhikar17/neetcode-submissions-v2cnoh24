class Solution {
    fun longestConsecutive(nums: IntArray): Int {
       var store = nums.toSet()

        var res=0

        for(num in nums){
            var streak=0
            var curr=num
            while(curr in store){
                streak++
                curr++
            }
          res = maxOf(res,streak)
        }
           return res
    }
}
