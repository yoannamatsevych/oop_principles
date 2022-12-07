package oop_principles.polymorphizm;

public class Animal {

    //eat, eat(String), sleep

    public void eat(){
        System.out.println("Animal eats");
    }

    public void eat(String food){
        System.out.println("Animal eats " + food);
    }

    public void sleep(){
        System.out.println("Animal sleep");
    }


}
