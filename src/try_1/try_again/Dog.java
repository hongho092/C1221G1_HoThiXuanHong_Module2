package try_1.try_again;

public class Dog extends Animal implements IDispaly{
    @Override
    public void display() {
        System.out.println(" chó ");
    }

    @Override
    public void displayDV() {
        System.out.println("Động vật 1");
    }
}
