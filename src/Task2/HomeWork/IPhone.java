package Task2.HomeWork;

public class IPhone extends Phone implements Printable {
    private int camera1_mp;
    private int camera2_mp;
    private int camera3_mp;

    public IPhone(String model, int cost, int camera1_mp, int camera2_mp, int camera3_mp) {
        super(model, cost);
        this.camera1_mp = camera1_mp;
        this.camera2_mp = camera2_mp;
        this.camera3_mp = camera3_mp;
    }

    @Override
    public int sumMegaPixel() {
        return camera1_mp + camera2_mp + camera3_mp;
    }

    @Override
    public void print() {
        System.out.println("------------------------");
        System.out.println("Model: " + getClass().getSimpleName() + " " + getModel() + "\nCost: $" + getCost() + "\n" + "Camera: " + sumMegaPixel() + "MP");
    }
}
