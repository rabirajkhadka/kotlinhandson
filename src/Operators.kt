/**
 * Created by rabiraj on 6/29/2017.
 */
fun main(args : Array<String>) {

    println("Enter Number One: ")
    var number_one : Float = readLine()!!.toFloat()
    println("Enter Number Two: ")
    var number_two : Float = readLine()!!.toFloat()

    var sum:Float
    sum = number_one + number_two

    var difference:Float
    difference = number_one - number_two

    var product:Float
    product = number_one * number_two

    var division:Float
    division = number_one / number_two

    println("Sum of number "+number_one+ " and "+number_two+" is "+ sum)
    println("Difference of number "+number_one+ " and "+number_two+" is "+ difference)
    println(""+number_one + " divided by "+number_two+" is "+division)
    println("Product of number "+number_one+ " and "+number_two+" is "+product)

    var testone = ++number_one - --number_two
    //var testtwo = ++number_one-number_two
    //var testthree = number_one++-number_two

    println("testone = number_one---number_two: "+testone)
    //println("testtwo = ++number_one-number_two: "+testtwo)
    //println("testthree = number_one++-number_two: "+testthree)


}