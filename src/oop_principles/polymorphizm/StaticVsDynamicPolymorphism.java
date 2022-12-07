package oop_principles.polymorphizm;

public class StaticVsDynamicPolymorphism {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat(); // static polymorphism

        Animal dog = new Dog(); // up-casted dog object
        dog.sleep(); // dynamic polymorphism
        // as compiler thinks the Animal method will be executed but
        // Runtime finds out that Dog  method will be executed

    }
}
