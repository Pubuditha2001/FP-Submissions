object javatoscala{
    def main(args: Array[String]):Unit = {
        
        var (a, b, c, d) = (2, 3, 4, 5)
        var k: Float = 4.3f

        //if in c
        val result1 = (b-1) * a + c * (d-1)
        println( "--b * a + c * d-- = " +result1);

        val result2 = a+1
        println("a++ = " +result2)

        //dont konw the "g" in (d - k)
        val result3 = -2 * ( d - k ) +c
        println("-2 * ( g - k ) +c = " +result3)

        c=c
        val result4 = c+1
        println("c=c++ = " +result4)

        c=(c+1)*(a+1)
        val result5 = c
        println("c=++c*a++ = " +result5);



    }
}
