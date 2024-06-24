object evaluation{
    def main(args: Array[String]):Unit = {
        
        val k = 2
        val i = 2
        val j = 2

        val m = 5
        val n = 5

        val f = 12.0f
        val g = 4.0f
        
        val c = "X"

        val result1 =  k + 12 * m
        println("k + 12 * m = " +result1)

        val result2 =   m / j
        println("m / j = " +result2)

        val result3 = n % j
        println("n % j = " +result3)

        val result4 = m / j * j
        println("m / j * j = " +result4)

        val result5 = f + 10*5 +g
        println("f + 10*5 +g = " +result5)

        val result6 = (i+1) * n
        println("++i * n = " +result6)
    }
}