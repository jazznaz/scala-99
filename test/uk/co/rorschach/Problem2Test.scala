package uk.co.rorschach

import org.junit.Assert.assertEquals
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Problem2Test extends FunSuite {

  test("Test an integer list.") {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8)
    assertEquals(7, Problem2.penultimate(list))
  }

  test("Test a String list.") {
    val list = List("one", "two", "three")
   assertEquals("two", Problem2.penultimate(list))
  }
}