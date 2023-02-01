import java.text.DecimalFormat
import java.util.*
import kotlin.math.abs

class IterationsMethod(private var M: Array<DoubleArray>, private var isJacobi: Boolean) {
    fun makeDominant(): Boolean {
        val visited = BooleanArray(M.size)
        val rows = IntArray(M.size)
        Arrays.fill(visited, false)
        return transformToDominant(0, visited, rows)
    }

    fun print() {
        val n = M.size
        for (i in 0 until n) {
            for (j in 0 until n + 1) {
                val result = DecimalFormat("#.#####").format(M[i][j])
                print("$result ")
            }
            println()
        }
    }

    fun solve() {
        var iterations: Int = if (isJacobi) {
            1
        } else {
            0
        }
        val n = M.size
        val epsilon = 1e-4
        val X = DoubleArray(n)
        var P = DoubleArray(n)
        Arrays.fill(X, 0.0)
        if (isJacobi) {
            Arrays.fill(P, 0.0)
        }
        while (true) {
            for (i in 0 until n) {
                var sum = M[i][n]
                for (j in 0 until n) {
                    if (j != i) {
                        sum -= if (isJacobi) {
                            M[i][j] * P[j]
                        } else {
                            M[i][j] * X[j]
                        }
                    }
                }
                X[i] = 1 / M[i][i] * sum
            }
            print("K = $iterations; X: ")
            for (i in 0 until n) {
                val result = DecimalFormat("#.#####").format(X[i])
                print("$result; ")
            }
            println()
            if (iterations != 0) {
                val result = DecimalFormat("#.#####").format(abs(X[0] - P[0]))
                println("||X(" + iterations + ")-X(" + (iterations - 1) + ")|| = " + result)
            }
            println()
            iterations++
            if (iterations == 1) {
                continue
            }
            var stop = true
            var i = 0
            while (i < n && stop) {
                if (abs(X[i] - P[i]) > epsilon) {
                    stop = false
                }
                i++
            }
            if (stop || iterations == MAX_ITERATIONS) {
                break
            }
            P = X.clone()
        }
    }

    private fun transformToDominant(r: Int, V: BooleanArray, R: IntArray): Boolean {
        val n = M.size
        if (r == M.size) {
            val T = Array(n) { DoubleArray(n + 1) }
            for (i in R.indices) {
                T[i] = M[R[i]].copyOf(n + 1)
            }
            M = T
            return true
        }
        for (i in 0 until n) {
            if (V[i]) {
                continue
            }
            var sum = 0.0
            for (j in 0 until n) {
                sum += abs(M[i][j])
            }
            if (2 * abs(M[i][r]) > sum) {
                V[i] = true
                R[r] = i
                if (transformToDominant(r + 1, V, R)) {
                    return true
                }
                V[i] = false
            }
        }
        return false
    }

    companion object {
        const val MAX_ITERATIONS = 10000
        @JvmStatic
        fun main(args: Array<String>) {
            var method: IterationsMethod
            val M: Array<DoubleArray> = Array(10) { DoubleArray(11) }
            for (i in 0..9) {
                for (j in 0..9) {
                    if (i == j) {
                        M[i][j] = 20.0
                    } else {
                        M[i][j] = 1.0
                    }
                }
                M[i][10] = (19 * (i + 1) + 171).toDouble()
            }
            method = IterationsMethod(M, true)
            println("\u0421\u0440\u0430\u0432\u043D\u0435\u043D\u0438\u0435 \u043C\u0435\u0442\u043E\u0434\u043E\u0432 \u044F\u043A\u043E\u0431\u0438 \u0438 \u0413\u0430\u0443\u0441\u0441\u0430-\u0417\u0435\u0439\u0434\u0435\u043B\u044F \u0434\u043B\u044F \u0440\u0435\u0448\u0435\u043D\u0438\u044F \u0421\u041B\u0410\u0423")
            println()
            println("\u0418\u0441\u0445\u043E\u0434\u043D\u0430\u044F \u043C\u0430\u0442\u0440\u0438\u0446\u0430:")
            println()
            method.print()
            println()
            println("\u0418\u0442\u0435\u0440\u0430\u0446\u0438\u0438 \u043F\u0440\u0438 \u043C\u0435\u0442\u043E\u0434\u0435 \u042F\u043A\u043E\u0431\u0438:")
            println()
            method.solve()
            println()
            println("\u0418\u0442\u0435\u0440\u0430\u0446\u0438\u0438 \u043F\u0440\u0438 \u043C\u0435\u0442\u043E\u0434\u0435 \u0417\u0435\u0439\u0434\u0435\u043B\u044F-\u0413\u0430\u0443\u0441\u0441\u0430:")
            println()
            method = IterationsMethod(M, false)
            method.solve()
        }
    }
}