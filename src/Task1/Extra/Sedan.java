package Task1.Extra;

public class Sedan extends Car{
    public Sedan(String desc, int year, Engine engine, Condition condition) {
        super(desc, year, engine, condition);
    }

    public void drive(){
        System.out.println("Sedan is driving...");
    }

    public final void beep(){
        System.out.println("Beeeeep....");
    }

    public void beep(String beep){
        System.out.println(beep);
    }
}
