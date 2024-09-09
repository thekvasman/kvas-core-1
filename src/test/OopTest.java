package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import task.oop.Child1;
import task.oop.Child2;
import task.oop.Parent;

public class OopTest {

  @Test
  public void testParentMethods() {
    Parent parent = new Parent();

    // Test sumOfTwoNumbers
    assertEquals(5, parent.sumOfTwoNumbers(2, 3));

    // Test sumOfStringAndNumber
    assertEquals(15, parent.sumOfStringAndNumber("10", 5));

    // Test returnString
    assertEquals("Hello", parent.returnString("Hello"));

    // Test printParent (cannot test void methods directly)

    // Test concatenateStrings
    assertEquals("HelloWorld", parent.concatenateStrings("Hello", "World"));
  }

  @Test
  public void testChild1Methods() {
    Child1 child1 = new Child1();

    // Test sumOfTwoNumbers
    assertEquals(6, child1.sumOfTwoNumbers(2, 3));

    // Test sumOfStringAndNumber
    assertEquals(30, child1.sumOfStringAndNumber("10", 5));

    // Test returnString
    assertEquals("H", child1.returnString("Hello"));

    // Test printParent (cannot test void methods directly)

    // Test concatenateStrings
    assertEquals("Hello", child1.concatenateStrings("Hello", "World"));
  }

  @Test
  public void testChild2Methods() {
    Child2 child2 = new Child2();

    // Test sumOfTwoNumbers
    assertEquals(6, child2.sumOfTwoNumbers(1, 2, 3));

    // Test sumOfStringAndNumber
    assertEquals(6, child2.sumOfStringAndNumber("1", "2", "3"));

    // Test returnString
    assertEquals("HelloWorld", child2.returnString("Hello", "World"));

    // Test printParent (cannot test void methods directly)

    // Test concatenateStrings
    assertEquals("HelloWorldJava", child2.concatenateStrings("Hello", "World", "Java"));
  }
}