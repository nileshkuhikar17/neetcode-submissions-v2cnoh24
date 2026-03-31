class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res=mutableListOf<List<Int>>()
        nums.sort()
        for(i in nums.indices){
        
            if(i>0 && nums[i]==nums[i-1]) continue
                var l =i+1
                var r=nums.size-1

                    while(l<r){
                        var sum=nums[i]+nums[l]+nums[r]
                            when{
                                sum > 0 -> r--
                                sum < 0 -> l++
                                else ->{
                                    res.add(listOf(nums[i],nums[l],nums[r]))
                                    l++
                                    r--
                                while(l<r && nums[l]==nums[l-1]){
                                    l++
                                }
                                 while(l<r && nums[r]==nums[r+1]){
                                    r--
                                }
                    }

                }
            }
        }
        return res
    }
}
