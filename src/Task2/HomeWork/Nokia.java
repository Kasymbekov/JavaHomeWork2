package Task2.HomeWork;

public class Nokia extends Phone implements Printable {
    private int camera1_mp;

    public Nokia(String model, int cost, int camera1_mp) {
        super(model, cost);
        this.camera1_mp = camera1_mp;
    }

    @Override
    public int sumMegaPixel() {
        return camera1_mp;
    }

    @Override
    public void print() {
        System.out.println("------------------------");
        System.out.println("Model: " + getClass().getSimpleName() + " " + getModel() + "\nCost: $" + getCost() + "\n" + "Camera: " + sumMegaPixel() + "MP");
    }
}
