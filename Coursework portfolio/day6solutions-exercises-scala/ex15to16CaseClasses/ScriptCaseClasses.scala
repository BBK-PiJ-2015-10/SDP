package day6.ex15to16CaseClasses

object ScriptCaseClasses extends App {
  
  //Question15
  
  val p = Person("Jane","Smile","jane@smile.com")
  assert(p.first == "Jane")
  assert(p.last == "Smile")
  assert(p.email == "jane@smile.com")
  
  //Question16
  
  val people = Vector(Person("Jane","Smile","jane@smile.com"),Person("Ron","House","ron@house"),Person("Sally","Dove","sally@dove"))
  println(people(0))
  println(people(1))
  println(people(2))    
  
 
  
}