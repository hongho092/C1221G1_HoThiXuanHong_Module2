package ss21_design_patterns.thuc_hanh.factory_method;

import ss21_design_patterns.thuc_hanh.factory_method.Animal;
import ss21_design_patterns.thuc_hanh.factory_method.AnimalFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 sound: " + a1.makeSound());

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 sound: " + a2.makeSound());
    }
}