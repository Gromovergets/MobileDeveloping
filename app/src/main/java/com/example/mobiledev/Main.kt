package com.example.mobiledev

/*fun main() {

  println("Введите первое число")
  val sum1: Int=readLine()?.toIntOrNull()?:0
  println("Введите второе число")
  val sum2: Int=readLine()?.toIntOrNull()?:0
var summ:Int=sum1+sum2
  var comp:Int=sum1*sum2


    println("sum ="+" " + summ+"\n"+"composion"+" "+comp)

}*/
fun main(){
  println("Введите цену которую заплатили за конфеты")
  val price: Double=readLine()?.toDouble()?:0.0

  println("Введите вес, куплинных конфет(кг)")
  val weight: Double = readLine()?.toDouble() ?: 0.0

  val pricebykg: Double = price/weight
  println("Введите вес конфет, которые хотели купить")

  val pricenew: Double=readLine()?.toDouble()?:0.0
  val cost:Double=(pricenew*pricebykg)

  println("Столько конфет будет стоить"+" - "+cost+" рублей")

  println("Давайте купим конфеты на все ваши деньги! Введите сумму ваших средств")
  val money: Int=readLine()?.toIntOrNull()?:0

  var weight2:Double=money/pricebykg
  println("На ваши деньги я смог купить"+" - "+weight2+"кг конфет")

  println("И ксатит мои конфекты стоят "+pricebykg+" За килограмм")

}