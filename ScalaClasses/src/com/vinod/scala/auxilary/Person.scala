package com.vinod.scala.auxilary

//primary constructor
class Person (var firstName: String, var lastName: String) {
  
  //one arg auxilary constructor
  def this(name: String) {
    this(name,"")
  }
  
  def this(name:String, name2: String, name3 : String) {
    this(name)
  }
}

object Person extends App {
  val p1 = new Person("Vinod", "Reddy")
  println(p1.firstName + p1.lastName)
  
  
}