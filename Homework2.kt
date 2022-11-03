fun main() {
    val result1 =sumOfAngles(10)
     println("İç açılar toplamı $result1")
    val result2 = findSalary(30)
    println("Salary $result2")

    val result3 = findPrice(60)
    println("Price $result3")


    val result4 = findFaranhiet(35)
    println("FaranHiet $result4")

    var result5 =findPerimeter(3.0,4.0)
    println("Perimeter $result5")
}

fun sumOfAngles(angleNum:Int): Int {
    var  sumAngle = (angleNum - 2) * 180
    return sumAngle
}

fun findSalary(workDay :Int):Int{
    var result=0
    var workHour = workDay*8;

    if(workHour <160) return  workHour*10
    else if (workHour >160)
        return (workHour-160)*20 +1600
    return  0
}

fun findPrice(limit :Int) :Int{
    if(limit <50){ return limit * 2
    }
    else if (limit>50){
        return 100 + ((limit-50)*4)

    }
    return 0
}

fun findFaranhiet(celcius : Int ): Double{
return (celcius * 1.8) +32
}


fun findPerimeter(a:Double,b:Double):Double{
    return 2 * (a + b)
}






