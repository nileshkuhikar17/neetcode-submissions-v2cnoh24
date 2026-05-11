class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var seen = HashSet<Int>()
        for(i in nums){
            if(seen.contains(i)) return true
            else seen.add(i)
        }
        return false
    }
}
