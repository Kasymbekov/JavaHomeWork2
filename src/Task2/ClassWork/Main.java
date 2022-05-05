package Task2.ClassWork;

public class Main {
    public static void main(String[] args) {
        //Init figures
        Circle circle = new Circle("Круг", 10);
        Triangle triangle = new Triangle("Треугольник", 5, 6, 7);
        Square square = new Square("Квадрат", 4);

        //Init animals
        Dog dog = new Dog("Alabai");
        Cat cat = new Cat("Pers");

        //Init array
        Drawable[] items = {circle, triangle, square, dog, cat};

        //Print array
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof Figure) {
                System.out.println("Периметр " + ((Figure) items[i]).getName() + "а равен " + ((Figure) items[i]).calculatePerimeter());
            }
            if (items[i] instanceof Animal) {
                System.out.println(((Animal) items[i]).getName() + " кушает");
            }
            items[i].drawable();
        }
    }
}
