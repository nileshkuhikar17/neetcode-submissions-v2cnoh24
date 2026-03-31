class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit=0
        var l=0
        var r=1
        while(r<prices.size){
            if(prices[l]<prices[r]){
                val p1=prices[r]-prices[l]
                profit=maxOf(profit,p1)
            }else{
                l=r
            }
            r++
        }
        return profit
    }
}
