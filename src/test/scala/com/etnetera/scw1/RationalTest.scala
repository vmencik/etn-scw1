package com.etnetera.scw1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RationalTest extends FunSuite {

  test("We can create an instance of Rational") {
    val r = new Rational(1, 2)
    assert(r.numer === 1)
    assert(r.denom === 2)
  }
  
  test("Rational instances are normalized on instantiation") {
    val r = new Rational(18, 27)
    assert(r.numer === 2)
    assert(r.denom === 3)
  }
  
  test("Negative numbers are allowed in numerator and denominator") {
    assertRationalsEq(new Rational(1, -2), new Rational(-1, 2))
    
    assertRationalsEq(new Rational(-1, -2), new Rational(1, 2))
    
    assertRationalsEq(new Rational(-1, 2), new Rational(-1, 2))
  }
  
  test("We can sum two rationals") {
    val a = new Rational(3, 2)
    val b = new Rational(7, 4)
    val r = a + b
    assert(r.numer === 13)
    assert(r.denom === 4)
  }
  
  test("We can subtract two rationals") {
    assertRationalsEq(new Rational(13, 4) - new Rational(3, 2),
        new Rational(7, 4))
  }
  
  test("Our special assertEq works") {
    val r = new Rational(12, 24)
    val q = new Rational(1, 2)
    assertRationalsEq(r, r)
    assertRationalsEq(r, q)
  }
  
  private def assertRationalsEq(r: Rational, q: Rational) = {
    assert(r === q)
  }
  
  

}