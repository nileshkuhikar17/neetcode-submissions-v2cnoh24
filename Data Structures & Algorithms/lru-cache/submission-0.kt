class LRUCache(capacity: Int) {

    private val capacity = capacity
    private val cache=mutableListOf<Pair<Int,Int>>()


    fun get(key: Int): Int {
        for(i in cache.indices){
            if(cache[i].first==key){
                val tmp= cache.removeAt(i)
                cache.add(tmp)
                return tmp.second

            }
        }
        return -1
    }

    fun put(key: Int, value: Int) {
        for(i in cache.indices){
            if(cache[i].first==key){
                cache.removeAt(i)
                cache.add(Pair(key,value))
                return
            }
        }
        if(cache.size==capacity){
            cache.removeAt(0)
        }
        cache.add(Pair(key,value))
    }
}
