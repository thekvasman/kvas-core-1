package task.oop;

public class Rectangle extends Figure {

    private final double width;
    private final double height;

    public Rectangle(String name, double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}