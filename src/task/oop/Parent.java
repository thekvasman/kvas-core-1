package task.oop;

public class Parent {

  public int sumOfTwoNumbers(int a, int b) {
    return a + b;
  }

  public int sumOfStringAndNumber(String str, int num) {
    return Integer.parseInt(str) + num;
  }

  public String returnString(String str) {
    return str;
  }

  public void printParent() {
    System.out.println("I am Parent");
  }

  public String concatenateStrings(String str1, String str2) {
    return str1 + str2;
  }
}