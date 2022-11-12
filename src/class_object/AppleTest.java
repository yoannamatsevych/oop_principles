package class_object;

public class AppleTest {
    public static void main(String[] args) {

        Apple apple1 = new Apple(); // new object only with <new> keyword
        Apple apple2 = apple1; // they are in the same location
        Apple myApple = apple2;

        System.out.println(apple1); // class_object.Apple@1540e19d
        System.out.println(apple2); // class_object.Apple@677327b6
        System.out.println(myApple); // class_object.Apple@1540e19d

        System.out.println("\n=========Apple-1=======\n");
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        System.out.println("\n=========Apple-2========\n");
        apple2.color = "Green";
        apple2.price = 0.75;
        apple2.taste = "sour";
        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);


        System.out.println(apple1);
        System.out.println(apple2);
    }
}
