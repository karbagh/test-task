val list = mutableListOf<Int>(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

var returnValue = -1
var c = 0
fun findInArrayFirstTrue(mutableList: MutableList<Int>): Int {
    if (mutableList.first() == 1){
        return 0
    }

    if (mutableList.size > 1) {
        c++
        val halfLength: Int = (mutableList.size / 2).toInt()

        if (mutableList.get(halfLength) == 1 && mutableList.get(halfLength - 1) == 0) {
            returnValue = halfLength
        } else if (mutableList.get(halfLength) == 1 && mutableList.get(halfLength - 1) == 1) {
            findInArrayFirstTrue(mutableList.subList(0, halfLength - 1))
        } else if (mutableList.get(halfLength) == 0 && mutableList.get(halfLength - 1) == 0) {
            findInArrayFirstTrue(mutableList.subList(halfLength, mutableList.size))
        }
    }

    return returnValue
}

fun main() {
    println(findInArrayFirstTrue(list))
}