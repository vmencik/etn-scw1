package com.etnetera.scw1

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class DummySuite extends FunSuite {

  test("Our dummy class is really dumb") {
    assert(new Dummy().message === "I'm dumb as nails")
  }

}