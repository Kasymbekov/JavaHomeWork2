package Task2.ClassWork;

public class Square extends Figure{

    private int a;

    public Square(String name, int a) {
        super(name);
        this.a = a;
    }

    @Override
    public int calculatePerimeter() {
        return 4 * a;
    }

    @Override
    public void drawable() {
        System.out.println("⬜ нарисован");
    }
}
