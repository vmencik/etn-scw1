package com.etnetera.scw1

abstract class A(a: Int) {

  val b = a * 2.5
  var c = b + 4

  def pow(exp: Int) = math.pow(a, exp)
  
  def abstr: Int

  val d = {
    println("Neco")
    3
  }
}

class B(a: Int, b: Int) extends A(a*2) {
  
  val abstr = 10
}

class C extends B(1, 10) {
  
  override val abstr = Constants.X
  
}

object Constants {
  val X = 10
}