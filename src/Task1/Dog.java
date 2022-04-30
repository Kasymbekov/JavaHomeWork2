package Task1;

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands, Shelter shelter, Color color) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColor(color);
    }

    public Dog(String name, String breed, Shelter shelter, Color color) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        String s = "";

        if (commands != null) {
            s += ", commands=" + Arrays.toString(commands);
        }

        return "Dog {" + super.toString() +
                " name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                s +
                '}';
    }

    public void makeVoice() {
        System.out.println("Gaw gaw");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }
}
