package ss21_design_patterns.thuc_hanh.factory_method;

import ss21_design_patterns.thuc_hanh.factory_method.Animal;
import ss21_design_patterns.thuc_hanh.factory_method.Cat;
import ss21_design_patterns.thuc_hanh.factory_method.Dog;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        if ("canine".equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
