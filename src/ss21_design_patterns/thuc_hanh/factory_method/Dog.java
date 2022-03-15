package ss21_design_patterns.thuc_hanh.factory_method;

import ss21_design_patterns.thuc_hanh.factory_method.Animal;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
