object lab {
    def costPerShow(attendees: Int): Double = {
        500.0 + ( 3.0 * attendees )
    }

    def getNetProfit(price: Double, attendees: Int): Double = {
        (price * attendees) - costPerShow(attendees)
    }

    def calculateAttendees(price: Double): Int = {
        (120 - ( (price - 15.0) * 4 )).toInt
    }

    def main(args: Array[String]): Unit = {

        
        var price = 10.0
        var atd = calculateAttendees(price)
        printf("Price = %.2f, Attendees = %d\n", price, atd)
        println("Net Profit = " + getNetProfit(price, atd))
    
        var price2 = 15.0
        var atd2 = calculateAttendees(price2)
        printf("Price = %.2f, Attendees = %d\n", price2, atd2)
        println("Net Profit = " + getNetProfit(price2, atd2))

        var price3 = 20.0
        var atd3 = calculateAttendees(price3)
        printf("Price = %.2f, Attendees = %d\n", price3, atd3)
        println("Net Profit = " + getNetProfit(price3, atd3))

        var price4 = 25.0
        var atd4 = calculateAttendees(price4)
        printf("Price = %.2f, Attendees = %d\n", price4, atd4)
        println("Net Profit = " + getNetProfit(price4, atd4))

        var price5 = 30.0
        var atd5 = calculateAttendees(price5)
        printf("Price = %.2f, Attendees = %d\n", price5, atd5)
        println("Net Profit = " + getNetProfit(price5, atd5))
    }
}
