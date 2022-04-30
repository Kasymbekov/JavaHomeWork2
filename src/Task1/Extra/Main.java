package Task1.Extra;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Car1", 1999, new Engine("V8", 550), Condition.BAD);
        System.out.println(sedan);
        sedan.drive();
        sedan.beep();
        System.out.println("------------------------------------------------");

        Mercedes mers = new Mercedes("Eagle", 2015, new Engine("V12", 600), Condition.EXCELLENT);
        System.out.println(mers);
        mers.drive();
        mers.beep("Buuuup");
        System.out.println("------------------------------------------------");

        Mercedes mers2 = new Mercedes("Pushok", 2015, new Engine("V6", 320), Condition.GOOD);
        System.out.println(mers2);
        mers2.drive();
        mers2.beep();
        System.out.println("------------------------------------------------");

    }
}
