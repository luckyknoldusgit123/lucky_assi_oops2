package com.knoldus.oops

object testdemo {
  def main(args: Array[String]): Unit = {
    var personOne = new Person("Test", 24)
    var personTwo = new Person("Test", 25)
    //var personOne =new com.knoldus.Person( name="TestAgain", age=24)
    //var personTwo=new com.knoldus.Person(name="Test",age=25) // Output: False..
    personOne.check(personTwo)
  }


}
