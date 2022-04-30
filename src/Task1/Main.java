package Task1;

public class Main {

    public static void main(String[] args) {
        //Init 1st dog
        Dog dog = new Dog("Rex", "Alabai", new String[]{"Eat", "Jump"}, new Shelter("Center", "Chui 10"), Color.BLACK);
        System.out.println(dog);
        dog.makeVoice();
        dog.makeVoice("Salam aleikum");
        System.out.println("----------------------------");

        //Init 2nd dog
        Dog dog2 = new Dog("Rex", "Alabai", new Shelter("Center", "Chui 10"), Color.BLACK);
        System.out.println(dog2);
        dog2.makeVoice();
        dog2.makeVoice("Myau");
        System.out.println("----------------------------");

        //Init 3rd dog
        Dog dog3 = new Dog();
        System.out.println(dog3);
        dog3.makeVoice();
        dog3.makeVoice("Hello world!");

    }
}
