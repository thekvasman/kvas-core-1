package task.oop;

public abstract class Figure {

  protected String name;

  public Figure(String name) {
    this.name = name;
  }

  public abstract double calculateArea();

  public String getName() {
    return null;
  }
}