package ss7_abstract_interface.thuc_hanh.animal;

    public class Chicken extends Animal implements IEdible {
        public Chicken() {
        }

        @Override
        public String makeSound() {
            return "Chicken: cluck-cluck!";
        }

        @Override
        public String howToEat() {
            return "could be fried";
        }
    }