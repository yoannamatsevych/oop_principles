package class_object;

public class Fruit {

    public static boolean hasColor;
    public boolean isSweet;
    public String name;
    public String shape;

    // Instance block is execited for each object wich called
    {
        System.out.println("This is an instance block");
       if(this.name.equals("Watermelon")) isSweet = true;
    }
    // Static block will be executed only once and before everything else in the same class
    static{
        hasColor = true;
        System.out.println("This is a static block");
    }


}
