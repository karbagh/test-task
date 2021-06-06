package Class

import java.lang.IndexOutOfBoundsException

class Spiral {
    fun spiralNumbers(n: Int): Array<IntArray>? {
        val matrix = Array(n) { IntArray(n) }
        var step = 0
        var a = 0
        var size: Int
        while (step < n / 2) {
            size = n - step * 2 - 1
            var i = 0
            var chunk: Int
            var chunkIndex: Int
            var chunkOffset: Int
            while (i < 4 * size) {
                chunk = i / size
                chunkIndex = i % size
                chunkOffset = n - step - 1

                when (chunk) {
                    0 -> matrix[step][chunkIndex + step] = a + 1
                    1 -> matrix[chunkIndex + step][chunkOffset] = a + 1
                    2 -> matrix[chunkOffset][chunkOffset - chunkIndex] = a + 1
                    3 -> matrix[chunkOffset - chunkIndex][step] = a + 1
                    else -> throw IndexOutOfBoundsException()
                }
                a++
                i++
            }
            if (n % 2 == 1) {
                matrix[n / 2][n / 2] = n * n
            }
            step++
        }
        return matrix
    }
}