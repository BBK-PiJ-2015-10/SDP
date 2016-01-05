import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial {
	
	trait Flyable {
		def fly: String 
	}
	
	trait BulletProof {
		def hitByBullet : String
		
		def ricochet(startSpeed : Double) : String = {
			 "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75) 
		}	
	}
	
	class Superhero(val name: String) extends Flyable with BulletProof {
		
		def fly = "%s flys through the air".format(this.name)
		
		def hitByBullet = "The bullet bounces off of %s".format(this.name)
	
	}
	
	
	
	abstract class Mammal(val name: String){
		var moveSpeed : Double
		
		def move : String
		
	}
	
	class Wolf(name : String) extends Mammal(name){
		var moveSpeed = 35.0
		
		def move = "The wolf %s runs %.2f mph".format(this.name,this.moveSpeed)
	}
	
	
	class Dog (name: String, sound: String, growl: String) extends Animal (name, sound){
		
		def this(name: String, sound: String ){
			this("No Name", sound, "No Growl")
			this.setName(name)
		}
		
		def this(name: String){
			this("No Name","No Sound","No Growl")
			this.setName(name)
		}
		
		def this(){
			this("No Name","No Sound","No Growl")
		}
		
		override def toString() : String = {
			return "%s with the id %d says %s or %s".format(this.name,this.id,this.sound,this.growl)
		
		}
	}
	
	
	
	
	
	object Animal {
		private var idNumber = 0
		private def newIdNum = { idNumber +=1; idNumber}
	}
	
	class Animal (var name: String, var sound: String){
		this.setName(name)
		
		val id = Animal.newIdNum
		
		def getName() : String = name
		def getSound(): String = sound
		
		def setName(name : String){
			if (!(name.matches(".*\\d+.*")))
				this.name = name
			else
				this.name = "No Name"
		}
	
		def setSound(sound : String){
			this.sound = sound
		}
		
		def this(name : String){
			this("No Name","No Sound")
			this.setName(name)
		}
		
		def this(){
			this("No Name","No Sound")
		}
		
		override def toString() : String = {
			return "%s with the id %d says %s".format(this.name,this.id,this.sound)
		}
		
	}
	
	
	
	def main (args: Array[String]){
	
		//Exception Handling
		
		def divideNums(num1 : Int, num2 :Int) = try
		{
			(num1 / num2)
		} catch {
			case ex: java.lang.ArithmeticException => " Can't divide by zero"
		} finally {
			// Clean up after exception
		}
	
		println(" 3 / 0" +divideNums(3,0))
	
		//File IO
		/**
		val writer = new PrintWriter("test.txt")
		writer.write("Just some random text\n Some more random stuff")
		writer.close()
		
		val textFromFile = Source.fromFile("test.txt", "UTF-8")
		
		val lineIterator = textFromFile.getLines
		
		for (line <- lineIterator)
			println(line)
			
		textFromFile.close()	
		*/
	
		//Tutorial on Higher Order Functions
		/**
		val log10Func = log10 _
		
		println(log10Func(1000))
		
		
		//Example of how to apply a formula to all values in a list
		List(1000.0, 10000.0).map(log10Func).foreach(println)
		
		//Similar, but Lambda expression style
		List(1,2,3,4,5).map((x :Int) => x * 50).foreach(println)
		
		List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)
		
		def times3(num : Int )= num * 3
		def times4(num : Int )= num * 4
		
		def multIt(func : (Int) => Double, num : Int) = {
			func(num)
		}
		
		printf("3 * 100 = %.1f\n", multIt(times3, 100))
		
		val divisorVal = 5
		
		val divisor5 = (num : Double) => num / divisorVal
		
		println("5 / 5 = " + divisor5(5.0))
		*/
		
	
		//Tutorial on Traits (just like interfaces)
		/**
		val superman = new Superhero("Superman")
		println(superman.fly)
		println(superman.hitByBullet)
		println(superman.ricochet(2500))
		*/
		
	
		//Tutorial on Inheritance
		/**
		val fang = new Wolf("Fang")
		fang.moveSpeed = 36.0
		println(fang.move)
		
		val spike = new Dog("Spike","Woof","Grrr")
		spike.setName("Spike")
		println(spike.toString)
		
		*/
	
	
	
		//Tutorial on classes
		/**
		val rover = new Animal
		rover.setName("Rover")
		rover.setSound("woof")
		printf("%s says %s\n", rover.getName, rover.getSound)
		
		val whiskers = new Animal("Whiskers","Meaouw")
		println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}")
		println(whiskers.toString)
		*/
	
	
		//Tutorial on Tuples
		/**
		var tupleMarge = (103, "Margaret Thatcher", 10.25)
		
		printf("%s owes us $%.2f\n", tupleMarge._2, tupleMarge._3)
	
		tupleMarge.productIterator.foreach{ i=> println(i)}
	
		println(tupleMarge.toString())
		*/
	
		//Tutorial on Maps
		/**
		val employees = Map("Manager" -> "Bob Smith", "Secretary" -> "Sue Brown")
		
		if (employees.contains("Manager"))
			printf("Manager : %s\n", employees("Manager"))
	
		val customers = collection.mutable.Map(100 -> "Paul Smith", 101 -> "Sally Smith" )
		
		printf("Cust 1: %s\n" , customers(100))
		
		customers(100) = "Tom Marks"
		customers(102) = "Megan Swift"
		
		for((k,v) <- customers)
			printf("%d : %s\n", k, v)
		*/
	
		//Tutorial on Arrays
		/**
		val favNums = new Array[Int](20)
		
		for (j <- 0 to (favNums.length - 1)){
			favNums(j)=j
			println(favNums(j))
		}
		
		val favNumsTimes2 = for (num <- favNums) yield 2 * num
		
		favNumsTimes2.foreach(println)
		
		var favNumsDiv4 = for (num <- favNums if num % 4 == 0 ) yield num
		
		favNumsDiv4.foreach(println)
		
		var multTable = Array.ofDim[Int](10,10)
		
		for (i <- 0 to 9){
			for (j <-0 to 9){
				multTable(i)(j) = i*j
			}
		}
		
		for (i <- 0 to 9){
			for (j <-0 to 9){
				printf("%d : %d = %d\n", i, j, multTable(i)(j))
			}
		}
		
		println("Sum : " + favNums.sum)
		println("Min : " + favNums.min)
		println("Max : " + favNums.max)
		
		//For a descending sort, in case of ascending use "_<_"
		val sortedNums = favNums.sortWith(_>_)  
		
		// This is to make the numbers into string and separate them by commas
		println(sortedNums.deep.mkString(", "))
		*/
		
		/**
		val friends = Array("Bob","Tom")
		friends(0) = "Sue"
		println("Best friends " + friends(0))
		val friends2 = ArrayBuffer[String]()
		
		friends2.insert(0,"Phil")
		friends2 += "Mark"
		friends2 ++= Array("Susy","Paul")
		friends2.insert(1,"Mike","Sally","Sam","Mary","Sue")
		friends2.remove(1,2)
		
		var friend : String = " "
		for (friend <- friends2)
			println(friend)
		
		//Array when the number of items is fixed
		//ArrayBuffer the number of items is variable
		*/
	
		/**
		def factorial(num : BigInt) : BigInt = {
			if (num <=1)
				1
			else
				num * factorial(num-1)
		} 
	
		println("Factorial of 4 = " + factorial(4))
		*/
	
	
		/**
		def getSum(args : Int*) : Int = {
			var sum: Int = 0
			for (num <- args){
				sum += num
			}
			sum
		}
		println("Get Sum " +getSum(1,2,3,4,5,6))
		*/
	
		/**
		def sayHi() : Unit = {
			println("Hi how are you")
		}
		sayHi
		//procedures are functions that don't return anything in Scala
		*/
	
	
		/**
		def getSum(num1 : Int = 1, num2 : Int = 1) : Int = {
			return num1 + num2
		}

		println("5 + 4 = " +getSum(5,4))
		println("5 + 4 = " +getSum(num2=5,num1=4))
			
		//def funcName (param1:dataType, param2: dataType): returnType = {
		//	function body
		//  return valueToReturn
		//}

		*/	
	
	
	/**
	var randSent = "I saw a dragon fly by"
	
	val randSentArray = randSent.toArray
	
	println(randSent.concat(" and explode"))
	println("String length: " + randSent.length)
	println("3rd index: " + randSent(3))
	println("Are a strings equal " + "I saw a dragon".equals(randSent))
	println("dragon starts at index " +randSent.indexOf("dragon"))
	
	for (v <- randSentArray)
		println(v)
	*/
	
	/**
		val name = "Derek"
		val age = 39
		val weight = 175.5
		
		println(s"Hello $name")
		println(f"I am ${age +1} and $weight%.2f")
	*/
	
	/**
		var numberGuess = 0
		do {
			print("Guess a number")
			numberGuess = readLine.toInt
		}  while (numberGuess != 15)
		printf("You guessed the secret number %d\n", 15 )
	*/
		
	}
	
	
}