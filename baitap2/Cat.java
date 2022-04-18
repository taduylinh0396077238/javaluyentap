package baitap2;

public class Cat extends Animal{
    public Cat(System name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
