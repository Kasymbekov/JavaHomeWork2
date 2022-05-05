package Task2.ClassWork;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void drawable() {
        System.out.println("\uD83D\uDC15 нарисована");
    }
}
