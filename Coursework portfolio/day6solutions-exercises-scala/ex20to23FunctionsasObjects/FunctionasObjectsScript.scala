package day6.ex20to23FunctionsasObjects

object FunctionasObjectsScript extends App {
  
  //Question 20
  
  def explicitSet(c1:Vector[Any]) :Set[Any] = {
    return c1.toSet
  }
  
  val exer20 = explicitSet(Vector(1,2,3,4))
  var result: String = ""
  for (i <- exer20) {
    result += i + ","
  }
  println(result)
  
  //Question 21
  
  val dogYears = (input: Int) => (input * 7)
  assert(dogYears(10) == 70)
  
  //Question 22
  
  var s=""
  val v = Vector(1,5,7,8) 
  v.foreach( n => (s += n*7 +" "))
  println(s)
  
  //Question 23
  var s2 = ""
  val numbers = Vector(1,2,5,3,7)
  numbers.foreach( n => s2 +=(n*n) +" ")
  println(s2)
  
  //v:+1
  
  
}