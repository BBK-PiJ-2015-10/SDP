package day4.partII.exer28

object ScriptExer28 {
  
  def main (args: Array[String]): Unit = {
    
    var p = Person ("Jane","Smile","jane@smile.com")
    assert(p.first == "Jane")
    assert(p.last == "Smile")
    assert(p.email == "jane@smile.com")
    
    val people = Vector (
        Person ("Jane","Smile","jane@smile.com"),
        Person ("Ron","House","ron@house.com"),
        Person ("Sally","Dove","sally@dove.com"))
    
    println(people(0))
    println(people(1))
    println(people(2))
    
  }
  
  
  
}