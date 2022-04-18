package baitap;

public class Dog extends Mammal{

    public Dog(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void geets(Dog another){
        System.out.println("woooof");
    }

    @Override
    public String toString() {
        return "Dog[" +
                "name='" + super.toString() + '\'' +
                ']';
    }
}
