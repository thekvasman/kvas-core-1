package task.oop;

public abstract class Employee {

  protected String name;
  protected int age;

  public Employee(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public abstract void work();

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}