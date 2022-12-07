package oop_principles.polymorphizm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {

        Object[] objects = {1, 2, 4.5, 'X', "Alex", "John", new Scanner(System.in), new ArrayList<>(), new Dog(), new Animal()};

        double d = (Double)objects[2] + 5;

       Dog dog = (Dog)objects[9];
       dog.bark();

       ArrayList<String> names = (ArrayList<String>) objects[8];
        System.out.println(names.size());

    }
}
