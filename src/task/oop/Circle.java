package task.oop;

public class Circle extends Figure{

  private final double radius;

  public Circle(String name, double radius) {
    super("Circle");
    this.radius = radius;
  }
  @Override
  public double calculateArea() {
    return  Math.pow(radius, 2) * Math.PI;
  }
}