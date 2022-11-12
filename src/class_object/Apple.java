package class_object;

public class Apple {


    //default constructor is provided by Java to create zero args object;

    public Apple(){ // it is always in class by default

        // each time you created a new object this block will be executed

        System.out.println("This is the default constructor");
    }

    //instance variable - fields - states - attributes

    public String color; // null
    public double price; // 0.0
    public String taste; // null

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", taste='" + taste + '\'' +
                '}';
    }
}
