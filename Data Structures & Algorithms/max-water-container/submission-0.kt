class Solution {
    var res=0
    fun maxArea(heights: IntArray): Int {
        for(i in heights.indices){
            for(j in i+1 until heights.size){
                var width=j-i
                var height=minOf(heights[i],heights[j])
                var area=width*height
                res=maxOf(res,area)
            }
        }
        return res
    }
}
