package Task2.ClassWork;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void drawable() {
        System.out.println("\uD83D\uDC08 нарисована");
    }
}
