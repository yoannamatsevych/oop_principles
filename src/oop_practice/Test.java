package oop_practice;

public class Test {
    public static void main(String[] args) {

        System.out.println("\nSword1 is created after thi line\n");
        Sword sword1 = new Sword("Iron"); // constructor
        System.out.println("Printing out the sword1 = " + sword1);

        System.out.println("\nSword2 is created after thi line\n");
        Sword sword2 = new Sword(3.5, 15.0, "long sword", "Iron"); // -> modified constructor
        System.out.println("Printing out the sword2 = " + sword2);

        System.out.println("\nSword2 is created after thi line\n");
        Sword sword3 = new Sword(10, 25.0, " super long sword", "Titanium"); // -> modified constructor
        System.out.println("Printing out the sword2 = " + sword3);

        System.out.println("Working with static variables");
        System.out.println(Sword.hasHandle);
        System.out.println("isSharp before" + Sword.isSharp);
        Sword.damage();

        //final value can not be changed
      //  Sword.hasHandle = true;
        Sword.isSharp = true;
        System.out.println("isSharp after " + Sword.isSharp); // reassigned value true
        Sword.damage();

        Sword.slash();

        System.out.println("\nWorking with non-static method\n");
        sword1.harms(); // 0
        sword2.harms(); //52.5
        sword3.harms(); // 250.0


    }
}
