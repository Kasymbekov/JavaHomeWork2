package Task2.HomeWork;

public class Main {
    public static void main(String[] args) {
        Printable[] phones = {createObject("Nokia"), createObject("Xiaomi"), createObject("IPhone")};

        for (int i = 0; i < phones.length; i++) {
            phones[i].print();
        }
    }

    //Init method to create object with default values
    private static Printable createObject(String className) {
        switch (className) {
            case "IPhone":
                return new IPhone("11", 550, 12, 12, 48);
            case "Nokia":
                return new Nokia("6230", 75, 12);
            case "Xiaomi":
                return new Xiaomi("11T Pro", 350, 48, 48);
        }
        return new Nokia("3310", 999, 8);
    }
}
