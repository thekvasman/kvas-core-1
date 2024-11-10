package task.oop;

public class Child1 extends Parent {
  @Override
  public int sumOfTwoNumbers(int a, int b) {
    return a * b;
  }
  @Override
  public int sumOfStringAndNumber(String str, int num) {
    return (Integer.parseInt(str) + num) * 2;
  }
  @Override
  public String returnString(String str) {
    return String.valueOf(str.charAt(0));
  }
  @Override
  public void printParent() {
    System.out.println("I am Child1");
  }
  @Override
  public String concatenateStrings(String str1, String str2) {
    return str1.concat(str2).substring(0, str1.concat(str2).length()/2);
  }
}