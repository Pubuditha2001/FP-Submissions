object Xyz{

    val pay_per_working = 250
    val pay_per_ot = 85
    //hours per week
    val w_hours = 40
    val ot_hours = 30
    val tax_per = 0.12

    def main(args: Array[String]): Unit={

        takehomesalaty()

    }

    def normalpay():Int ={
        val normal_hours_pay = pay_per_working*w_hours
        println("Normal hours payment per week = " +normal_hours_pay)
        normal_hours_pay
    }

    def ot_pay():Int ={
        val ot_hours_pay = pay_per_ot*ot_hours
        println("OT hours payment per week = " +ot_hours_pay)
        ot_hours_pay
    }

    def fullpaymentPerWeek():Int ={
        val totalpayment = normalpay() + ot_pay()
        println("Total payment per week = " +totalpayment)
        totalpayment
    }

    def totalpaymentpermonth():Double ={
        val totalpayment_month = fullpaymentPerWeek()/7*30
        println("Total payment of month = " +totalpayment_month)
        totalpayment_month
    }
   
    def totaltax():Double ={
        val tax= totalpaymentpermonth()*tax_per
        println("Total tax = " +tax)
        tax
    }

    def takehomesalaty():Unit = {
        val result = totalpaymentpermonth() - totaltax()
        println("Take Home Salary = " +result)
    }
}