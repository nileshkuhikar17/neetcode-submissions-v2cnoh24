class Solution {
    fun longestConsecutive(nums: IntArray): Int {
         val numset=nums.toSet()
         var longest=0
         
         for(num in numset){
            if((num-1)!in numset){
                var length=1
                while((num+length) in numset){
                    length++
                }
                longest=maxOf(longest,length)
            }
         }
         return longest
    }
}
