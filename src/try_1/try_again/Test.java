package try_1.try_again;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        TestAnimal testAnimal = new TestAnimal();
        testAnimal.dis(chicken);
        testAnimal.dis(dog);
    }
}
