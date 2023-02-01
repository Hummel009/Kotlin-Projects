import java.util.*

var scan = Scanner(System.`in`)

// Массив растояний проходов от узла к узлу
var step = IntArray(100)

// Массив растояний от узла к узлу
var arrv: Array<Array<Int>> = Array(10) { Array(10) { 0 } }

fun main() {
    val arrp: Array<Int> = Array(10) { 1 }
    for (sus in 0 until 100) {
        step[sus] = 0
    }

    // Вписываем количество узлов
    System.out.printf("Write Number of Nodes: ")
    val i: Int = scan.nextInt()

    // Записываем направления и сложности проходов узлов: (1 -> 3: 5) связь
    // от узла 1 к узлу 3 со сложностью 5
    for (j in 0 until i) {
        for (k in 0 until i) {
            if (j != k) {
                System.out.printf("Write the Distance: %d -> %d: ", j + 1, k + 1)
                arrv[j][k] = scan.nextInt()
            } else {
                arrv[j][k] = 0
            }
        }
    }

    // Вывод Матрицы смежности
    System.out.printf("\n  |")
    for (k in 0 until i) {
        System.out.printf("__%d_|", k + 1)
    }
    System.out.printf("\n")
    for (j in 0 until i) {
        System.out.printf("|%d|", j + 1)
        for (k in 0 until i) {
            System.out.printf(" %2d |", arrv[j][k])
        }
        System.out.printf("\n")
    }

    // Нахождение путей от узла к узлу
    System.out.printf("\nFind a way from: ")
    var tmp1: Int = scan.nextInt()
    System.out.printf("Find a way to: ")
    var tmp2: Int = scan.nextInt()
    arrp[tmp1 - 1] = 0
    // Нахождение всех путей
    search(tmp1 - 1, 0, arrp, tmp1 - 1, tmp2 - 1, i, 0)

    // Матрица содержащая сложности всех путей
    var y = 0
    while (step[y] != 0) {
        y++
    }
    System.out.printf("\n")

    // Сортировка матрицы путей
    for (g in 0 until y - 1) {
        for (j in 0 until y - g - 1) {
            if (step[j] > step[j + 1]) {
                val tmps = step[j]
                step[j] = step[j + 1]
                step[j + 1] = tmps
            }
        }
    }
    val arrm: Array<Int> = Array(10) { 0 }

    // Нахождение минимального пути
    System.out.printf("Min: ")
    arrm[0] = tmp1
    maxMin(tmp1 - 1, 0, arrp, tmp1 - 1, tmp2 - 1, i, 0, step[0], arrm) // min

    // Нахождение максимального пути
    System.out.printf("Max: ")
    maxMin(tmp1 - 1, 0, arrp, tmp1 - 1, tmp2 - 1, i, 0, step[y - 1], arrm) // max

    // Нахождение всех путей
    System.out.printf("\nAll: \n")
    for (g in 0 until y) {
        if (g == 0 || step[g] != step[g - 1]) {
            maxMin(tmp1 - 1, 0, arrp, tmp1 - 1, tmp2 - 1, i, 0, step[g], arrm)
        }
    }

    // Нахождение эксцентриситетов (Минимальное растояние от узла к узлу)
    val ex: Array<Array<Int>> = Array(11) { Array(11) { 0 } }

    tmp1 = 1
    while (tmp1 <= i) {
        tmp2 = 1
        while (tmp2 <= i) {
            for (g in 0..i) {
                arrp[g] = 1
            }
            var g1 = 0
            while (step[g1] != 0) {
                step[g1] = 0
                g1++
            }
            arrp[tmp1 - 1] = 0
            search(tmp1 - 1, 0, arrp, tmp1 - 1, tmp2 - 1, i, 0)
            var w = 0
            while (step[w] != 0) {
                w++
            }
            for (g in 0 until w - 1) {
                for (j in 0 until w - g - 1) {
                    if (step[j] > step[j + 1]) {
                        val tmps = step[j]
                        step[j] = step[j + 1]
                        step[j + 1] = tmps
                    }
                }
            }
            ex[tmp1 - 1][tmp2 - 1] = step[0]
            tmp2++
        }
        tmp1++
    }
    // Нахождение минимальный эксцентриситет каждого узла и записи их на
    // i-ую строку в масииве (Если нет эксцентрисита у узла, то = 0 и
    // центром узел быть не может)
    for (maxj in 0 until i) {
        var temp = 2
        var tempmax = ex[0][maxj]
        if (tempmax == 0) {
            temp--
        }
        for (maxi in 1 until i) {
            if (ex[maxi][maxj] > tempmax) {
                tempmax = ex[maxi][maxj]
            }
            if (ex[maxi][maxj] == 0) {
                temp--
            }
        }
        if (temp > 0) {
            ex[i][maxj] = tempmax
        } else {
            ex[i][maxj] = 0
        }
    }

    // Вывод мтарицы эксцентриситетов
    System.out.printf("\n  |")
    for (k in 0 until i) {
        System.out.printf("__%d_|", k + 1)
    }
    System.out.printf("\n")
    for (j in 0 until i) {
        System.out.printf("|%d|", j + 1)
        for (k in 0 until i) {
            System.out.printf(" %2d |", ex[j][k])
        }
        System.out.printf("\n")
    }

    // Нахождение центра или центров, если эксцентриситеты совпадают
    var tempmin = ex[i][0]
    for (maxj in 1 until i) {
        if (ex[i][maxj] < tempmin && ex[i][maxj] != 0) {
            tempmin = ex[i][maxj]
        }
    }

    // Вывод центра
    System.out.printf("\nCenter(s): ")
    for (maxj in 0 until i) {
        if (ex[i][maxj] == tempmin) {
            System.out.printf("%d ", maxj + 1)
        }
    }
}

private fun maxMin(
    j: Int,
    k: Int,
    arrp: Array<Int>,
    tmp1: Int,
    tmp2: Int,
    i: Int,
    tmp: Int,
    mm: Int,
    arrm: Array<Int>
) {
    var k = k
    while (k < i && j != tmp2) {
        if (arrv[j][k] != 0 && arrp[k] != 0) {
            val arrpt = arrp.clone()
            val arrmt = arrm.clone()
            var g = 0
            while (arrmt[g] != 0) {
                g++
            }
            arrmt[g] = k + 1
            arrpt[k] = 0
            maxMin(k, 0, arrpt, tmp1, tmp2, i, tmp + arrv[j][k], mm, arrmt)
        }
        k++
    }
    if (j == tmp2 && tmp == mm) {
        System.out.printf("%d ", arrm[0])
        var g = 1
        while (arrm[g] != 0) {
            System.out.printf("-> %d ", arrm[g])
            g++
        }
        System.out.printf("(%d)\n", tmp)
    }
}

private fun search(j: Int, k: Int, arrp: Array<Int>, tmp1: Int, tmp2: Int, i: Int, tmp: Int) {
    var k = k
    while (k < i && j != tmp2) {
        if (arrv[j][k] != 0 && arrp[k] != 0) {
            val arrpt: Array<Int> = arrp.clone()
            arrpt[k] = 0
            search(k, 0, arrpt, tmp1, tmp2, i, tmp + arrv[j][k])
        }
        k++
    }
    if (j == tmp2) {
        var t = 0
        while (step[t] != 0) {
            t++
        }
        step[t] = tmp
    }
}