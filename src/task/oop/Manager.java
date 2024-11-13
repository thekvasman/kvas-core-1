package task.oop;

public class Manager extends Employee{

  private String department;

  public Manager(String name, int age, String department) {
    super("Михаил", 50);
    this.department = department;
  }

  public void work() {
    System.out.println("Я менеджер");
  }
}