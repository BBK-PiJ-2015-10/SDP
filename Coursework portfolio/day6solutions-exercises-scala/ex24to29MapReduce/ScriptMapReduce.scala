package day6.ex24to29MapReduce

object ScriptMapReduce extends App {
  
  //Question 24
  
  val v = Vector (1,2,3,4)
  println(v.map( n => n*11 + 10))
  println(v)
  
  //Questions 25
  
  val v2 = Vector (1,2,3,4)
  println(v2.foreach( n => n*11 + 10))
  
  //*The output is only a ()
  
  //Question 26
  
  //Question 27
  
  val v3 = Vector(1,2,3,4)
  println(v3.map(n => n + 1))
  
 //Question 28
  
 //Question 29
  
  var sumIt = 0
  val v4 = Vector(1,2,3)
  assert(v4.reduce((sumIt,n) => (sumIt +n)) == 6)
  
  val v5 = Vector(45,45,45,60)
  assert(v5.reduce((sumIt,n) => (sumIt + n )) == 195)
  
  
  
  //v:+1
  

  
  
  
  
}