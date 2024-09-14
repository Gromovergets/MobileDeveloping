package com.example.mobiledev
import kotlin.math.PI
//_________0*_________
/*fun main() {

  println("Введите первое число")
  val sum1: Int=readLine()?.toIntOrNull()?:0
  println("Введите второе число")
  val sum2: Int=readLine()?.toIntOrNull()?:0
var summ:Int=sum1+sum2
  var comp:Int=sum1*sum2


    println("sum ="+" " + summ+"\n"+"composion"+" "+comp)

}*/
//________1_________
/*fun main(){


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

}*/
//_______2_______
/*fun main() {
  println("Введите первое чиило")
  val num1: Double = readln()?.toDouble() ?: 0.0

  println("Введите первое чиило")
  val num2: Double = readln()?.toDouble() ?: 0.0

  println("Введите первое чиило")
  val num3: Double = readln()?.toDouble() ?: 0.0

  if(num1==num2||num1==num3||num2==num3){
    println("yes")
  }
  else{
    println("no")
  }

}*/

//_________3_________
/*fun main(){
  for(i in 1..2){
    for(j in 1..5){
      print("${i * j} \t")
    }
    println()
  }
}
*/

 //________4________
/*fun main(){
   var num:Int=(10..100).random()
  var mainarray = IntArray(num)
   println("Индекс массива = "+mainarray.size)
   for(i in 0 ..num-1){

        mainarray[i]=(10..100).random()
     println(mainarray[i])

   }


   println("Max by array = "+ mainarray.maxOrNull()+"\n"+"Min by array = "+ mainarray.minOrNull())
}
*/

//__________5_________

public abstract class figure(){

  abstract fun num_corners():Int
  abstract fun perimeter():Int
  abstract fun area():Int
  }
 public class rectangle():figure() {

    public var width:Int
      get(){return  width}
      set(value){
        width=value
      }
   public var height:Int
     get(){return  height}
     set(value){
       height=value
     }

   override fun perimeter(): Int {
     return width * 2 + height * 2;
   }

   override fun area(): Int {
     return width * height;

   }
   override  fun num_corners():Int{
     return 4;
   }
 }
class circle():figure() {
  public var radius: Int
    get() {
      return radius
    }
    set(value) {
      radius = value
    }


  override fun perimeter():Int{

    return (PI * 2 * radius).toInt()
  }

  override fun area(): Int {
    return ((PI*PI)*radius).toInt()

  }

  override fun num_corners(): Int {
    return 0;
  }
}

