package ss21_design_patterns.thuc_hanh.factory_method;

import ss21_design_patterns.thuc_hanh.factory_method.Animal;

public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "Meow";
    }
}
