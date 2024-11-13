package task.oop;

public class WarehouseWorker extends Employee{
  private final String shift;

  public WarehouseWorker(String name, int age, String shift) {
    super("Игорь", 35);
    this.shift = shift;
  }

  public void work() {
    System.out.println("Я работник склада");
  }
}