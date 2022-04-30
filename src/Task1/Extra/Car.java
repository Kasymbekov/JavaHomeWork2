package Task1.Extra;

public class Car {
    private String desc;
    private int year;
    private Engine engine;
    private Condition condition;

    public Car(String desc, int year, Engine engine, Condition condition) {
        this.desc = desc;
        this.year = year;
        this.engine = engine;
        this.condition = condition;
    }

    public String getDesc() {
        return desc;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " {" +
                "desc='" + desc + '\'' +
                ", year=" + year +
                ", engine_desc=" + engine.getDesc() +
                ", engine_capacity=" + engine.getCapacity() +
                ", condition=" + condition +
                '}';
    }
}
