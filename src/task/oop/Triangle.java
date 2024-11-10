package task.oop;

public class Triangle extends Figure {
    private final double base;
    private final double height;

    public Triangle(String name, double base, double height) {
        super("Triangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height / 2;
    }
}