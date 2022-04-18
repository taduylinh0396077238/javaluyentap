package baitap2;

public class Dog extends Animal{
    public Dog(System name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
