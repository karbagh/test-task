import Class.Sort
import Class.Spiral
import java.util.*

val list = mutableListOf<Int>(0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)

val mt = mutableListOf<Int>(1,3,4,6,7,12,23,32,54)
val nt = mutableListOf<Int>(-31,-3,2,12,34,43,76,123,154)

fun main() {
//    val findInArrayFirstOneElement = Class.FindInArrayFirstOneElement()
//    println(findInArrayFirstOneElement.findInArrayFirstTrue(list))
//    val sort = Sort()
//    println(sort.mergeSorted(mt, nt))
    val spiral = Spiral()
    val array = spiral.spiralNumbers(4)

    if (array != null) {
        for (element in array)  {
            for (el in element) {
                print(String.format("%10s", el));
            }
            println()
        }
    }
}