package task.oop;

public class Child2 extends Parent{
  public int sumOfTwoNumbers(int a, int b, int c) {
    return a + b + c;
  }

  public int sumOfStringAndNumber(String str1, String str2, String str3) {
    return Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
  }

  public String returnString(String str1, String str2) {
    return str1 + str2;
  }

  public void printParent(String str) {
    System.out.println("I am Child2 " + str);
  }

  public String concatenateStrings(String str1, String str2, String str3) {
    return str1 + str2 + str3;
  }
}