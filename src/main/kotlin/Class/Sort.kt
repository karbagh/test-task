package Class

class Sort {
    fun mergeSorted(mt: MutableList<Int>, nt: MutableList<Int>): MutableList<Int> {
        val sortList: MutableList<Int> = mutableListOf<Int>()
        val end: Int = if (mt.size > nt.size) mt.size else nt.size

        for (i in 0..end-1) {
            var j = 1
            while (j < end) {
                if (mt.contains(j) && nt.get(j) > mt.get(i)){
                    sortList.add(mt.get(j))
                    mt.remove(j)
                }
                j = j * 2
            }
            sortList.add(nt.get(i))
        }

        return sortList
    }
}