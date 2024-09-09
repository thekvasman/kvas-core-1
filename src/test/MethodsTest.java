package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import task.methods.Methods;

public class MethodsTest {

  Methods methods = new Methods();

  @Test
  public void testStringToLowerCase() {
    //given
    String expectedResult = "string";

    //when
    String actualResult = methods.stringToLowerCase("STRING");

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testSumOfTwoNumbers() {
    //given
    int a = 2;
    int b = 3;
    int expectedResult = 5;

    //when
    int actualResult = methods.sumOfTwoNumbers(a, b);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testSumOfTwoStrings() {
    //given
    String a = "Hello";
    String b = "World";
    String expectedResult = "HelloWorld";

    //when
    String actualResult = methods.sumOfTwoStrings(a, b);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testSumOfStringAndNumber() {
    //given
    String str = "10";
    int num = 5;
    String expectedResult = "15";

    //when
    String actualResult = methods.sumOfStringAndNumber(str, num);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testCompareStringNumberWithInt() {
    //given
    String str = "5";
    int num = 10;
    boolean expectedResult = true;

    //when
    boolean actualResult = methods.compareStringNumberWithInt(str, num);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testCheckBooleans() {
    //given
    boolean a = true;
    boolean b = false;
    boolean expectedResult = true;

    //when
    boolean actualResult = methods.checkBooleans(a, b);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testIsEven() {
    //given
    int num = 4;
    boolean expectedResult = true;

    //when
    boolean actualResult = methods.isEven(num);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testCheckArrayEvenOdd() {
    //given
    int[] arr = {2, 4, 6};
    String expectedResult = "Массив четных чисел";

    //when
    String actualResult = methods.checkArrayEvenOdd(arr);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testSumArrayElements() {
    //given
    int[] arr = {1, 2, 3};
    int[] expectedResult = {1, 3, 6};

    //when
    int[] actualResult = methods.sumArrayElements(arr);

    //then
    assertArrayEquals(expectedResult, actualResult);
  }

  @Test
  public void testSumArray() {
    //given
    int[] arr = {1, 2, 3};
    int expectedResult = 6;

    //when
    int actualResult = methods.sumArray(arr);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testAgeCalculations() {
    //given
    int years = 10;
    int expectedResult = 120;

    //when
    int actualResult = methods.ageInMonths(years);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testAreNamesEqual() {
    //given
    String name1 = "John";
    String name2 = "john";
    boolean expectedResult = true;

    //when
    boolean actualResult = methods.areNamesEqual(name1, name2);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testGetLastElement() {
    //given
    int[] arr = {1, 2, 3};
    int expectedResult = 3;

    //when
    int actualResult = methods.getLastElement(arr);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testCountLetterA() {
    //given
    String str = "AaA";
    int expectedResult = 3;

    //when
    int actualResult = methods.countLetterA(str);

    //then
    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void testWallet() {
    //given
    int amount = 100;
    String expectedResult = "Остаток в кошельке: 900";

    //when
    String actualResult = methods.withdraw(amount);

    //then
    assertEquals(expectedResult, actualResult);
  }
}