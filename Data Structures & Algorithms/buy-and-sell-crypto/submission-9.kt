class Solution {
    fun maxProfit(prices: IntArray): Int {
        var profit=0
        for(i in prices.indices){
            for(j in i+1 until prices.size){
                var p1=0
                if(prices[i]<prices[j]){
                    p1=prices[j]-prices[i]
                }
                if(profit<p1){
                    profit=p1
                }
               
            }
        }
        return profit
    }
}
