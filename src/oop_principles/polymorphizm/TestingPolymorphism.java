package oop_principles.polymorphizm;

public class TestingPolymorphism {
    public static void main(String[] args) {


        Animal a1 = new Animal();
        a1.eat();
        a1.eat("Meat");
        a1.sleep();

        Cat c1 = new Cat();
        c1.eat();
        c1.eat("Meat");
        c1.sleep();
        c1.meow();

        Dog d1 = new Dog();
        d1.eat();
        d1.eat("Bone");
        d1.sleep();
        d1.bark();

        /*Up-casting
        parents reference = child object
        */

        System.out.println("\n=====Up-casting-implicitly=====");
        Animal a2 = new Cat();
        Animal a3 = new Dog();

        a3.sleep(); // Dog sleep

        System.out.println("\n======Down-casting-explicitly=======");

//        Cat cat = (Cat) new Animal(); // bad example of down-casting - ClassCastException
//        cat.meow();

        Animal myDog = new Dog(); //up-casting
        Dog newDog = (Dog) myDog;

        newDog.bark();

    }
}
