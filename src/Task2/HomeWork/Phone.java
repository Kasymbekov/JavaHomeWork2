package Task2.HomeWork;

public abstract class Phone {
    private String model;
    private int cost;

    public Phone(String model, int cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public abstract int sumMegaPixel();

}
