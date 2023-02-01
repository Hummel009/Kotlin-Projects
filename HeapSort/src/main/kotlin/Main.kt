class HeapSort {
    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является индексом в arr[]. n - размер кучи
    fun heapify(arr: IntArray, n: Int, i: Int) {
        var max = i // Инициализируем наибольший элемент как корень
        val l = 2 * i + 1 // левый = 2*i + 1
        val r = 2 * i + 2 // правый = 2*i + 2
        var flag = true
        println("I = " + i.toString() + "; Arr[I] = " + arr[i].toString())
        println("L = $l; R = $r; Max = $max")
        if (l < n && r < n) {
            println(
                "Arr[L] = " + arr[l].toString() + "; Arr[R] = " + arr[r].toString() + "; Arr[Max] = " + arr[max].toString()
            )
        } else if (n in (r + 1)..l) {
            println("L >= $n")
            flag = false
        } else if (n in (l + 1)..r) {
            println("R >= $n")
            flag = false
        } else {
            println("L >= $n; R >= $n")
            flag = false
        }

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[max]) {
            println(
                "Arr[L] > Arr[Max] => Max = L = $l; Arr[Max] = " + arr[l].toString()
            )
            max = l
        } else if (flag) {
            println("Arr[L] < Arr[Max]")
        }

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[max]) {
            println(
                "Arr[R] > Arr[Max] => Max = R = $r; Arr[Max] = " + arr[r].toString()
            )
            max = r
            println("Arr[Max] = " + arr[max].toString())
        } else if (flag) {
            println("Arr[R] < Arr[Max]")
        }

        // Если самый большой элемент не корень
        if (max != i) {
            println("Max <> I => Swap(Arr[I], Arr[Max])")
            val swap = arr[i]
            arr[i] = arr[max]
            arr[max] = swap
            printArray(arr)
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, max)
        } else {
            println("Max = I")
        }
    }

    fun sort(arr: IntArray) {
        val n = arr.size
        println()
        println()
        println("Making heap")
        // Построение кучи (перегруппируем массив)
        for (i in n / 2 - 1 downTo 0) {
            heapify(arr, n, i)
            printArray(arr)
            println()
        }
        println()
        println("Taking elements")

        // Один за другим извлекаем элементы из кучи
        for (i in n - 1 downTo 0) {
            // Перемещаем текущий корень в конец
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp
            println("N = $i; Swap(Arr[0], Arr[N])")
            println(
                "Arr[0] = " + arr[0].toString() + "; Arr[N] = " + arr[i].toString()
            )
            printArray(arr)
            heapify(arr, i, 0)
            printArray(arr)
            println()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(8, 4, 8, 13, 1, 10, 9, 5, 7, 6, 11, 14, 2, 12, 15)
            println("Start array is")
            printArray(arr)
            val ob = HeapSort()
            ob.sort(arr)
            println("Final array is")
            printArray(arr)
        }

        /* Вспомогательная функция для вывода на экран массива размера n */
        fun printArray(arr: IntArray) {
            val n = arr.size
            for (i in 0 until n) {
                print(arr[i].toString() + " ")
            }
            println()
        }
    }
}