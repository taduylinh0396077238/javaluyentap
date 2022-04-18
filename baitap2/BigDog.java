package baitap2;

public class BigDog extends Dog{
    public BigDog(System name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooooow");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooow");
    }
}
