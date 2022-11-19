package java_memory_managment;

import class_object.Car;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;

        System.out.println(age);

        Car car1 = new Car();
        car1.make = "tesla";

        System.out.println(car1);
    }
}
