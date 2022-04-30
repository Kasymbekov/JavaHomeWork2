package Task1.Extra;

public final class Mercedes extends Sedan{
    public Mercedes(String desc, int year, Engine engine, Condition condition) {
        super(desc, year, engine, condition);
    }

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " (" + this.getDesc() + ")" + " is driving...");
    }
}
