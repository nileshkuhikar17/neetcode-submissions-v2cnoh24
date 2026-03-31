class Solution {
    var res=0
    fun maxArea(heights: IntArray): Int {
        var l=0
        var r=heights.size-1
        while(l<r){
            var height=minOf(heights[l],heights[r])
            var width=(r-l)
            var area=height * width
            res=maxOf(res,area)
            if(heights[l]<heights[r]){
                l++
            }else{
                r--
            }
        }
        return res
    }
}
