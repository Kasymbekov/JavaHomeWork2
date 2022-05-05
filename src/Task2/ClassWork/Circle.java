package Task2.ClassWork;

public class Circle extends Figure{
    private int diameter;

    public Circle(String name, int diameter) {
        super(name);
        this.diameter = diameter;
    }

    @Override
    public int calculatePerimeter() {
        return (int)(diameter * Math.PI * 2);
    }

    @Override
    public void drawable() {
        System.out.println("\uD83D\uDD34 нарисован");
    }
}
