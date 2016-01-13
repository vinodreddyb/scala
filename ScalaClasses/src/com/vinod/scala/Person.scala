package com.vinod.scala

class Person (var firstName: String, var lastName: String) {
  println("Constructor started")
  

  private var HOME = System.getProperty("user.home")
  
  def printHome {
    print(s"$HOME")
  }
  
  def printlnHome( fn:String,  sn:String) : String = {
    println(s"println $HOME")
     fn + sn
  }
  
  // Assign the function to a variable
  val concat : (String,String) => String = printlnHome
  
  override def toString() = s"$firstName $lastName"
}

object PersonObj extends App {
  var p = new Person("Vinod","Reddy");
    p.printHome;
    var ct = p.printlnHome("v","k");
    val s = p.toString()
   
    println(s)
    println(ct)
    println(p.concat("India","vinod"))
    
}