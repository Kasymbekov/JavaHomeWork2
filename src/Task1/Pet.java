package Task1;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return new Random().nextInt(10) + 1;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", color=" + color +
                ", shelter=" + shelter.getName() + ", address=" + shelter.getAddress() +
                '}';
    }
}
