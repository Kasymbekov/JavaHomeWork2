package Task1;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "Alabai", new String[]{"Eat", "Jump"}, new Shelter("Center", "Chui 10"), Color.BLACK);
        System.out.println(dog);
        dog.makeVoice();
        dog.makeVoice("Salam aleikum");

        Dog dog2 = new Dog("Rex", "Alabai", new Shelter("Center", "Chui 10"), Color.BLACK);
        System.out.println("----------------------------");
        System.out.println(dog2);
        dog2.makeVoice();
        dog2.makeVoice("Myau");

    }
}
