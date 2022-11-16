package oop_practice;

public class Sword {

    // running only once before everything
    static  {
        System.out.println("Starting the sword making furnace");
    }
    // running everytime when we create object before everything after static
    {
        System.out.println("Heating up the furnace");
    }
    // 1. Constructor

    // Default Constructor
    public Sword(String material){
        this.material = material;
    }

    // Modified constructor
    public Sword(double weight, double length, String name, String material){
        this(material);
        this.weight = weight; // assign the value of local variable in the instance variable
        this.length = length;
        this.name = name;

    }

    // 2. Instance Variable

    //static -> belong to the class, What does every sword has?
    public static final boolean hasHandle = true;
    public static boolean isSharp;


    //non-static -> belong to the object. What is changing sword by sword
    public double weight;
    public double length;
    public String name;
    public String material;

    // 3. Method -> What does a sword do

    //static -> belong to the class, What does every sword do?
    public static void slash(){
        System.out.println("Sword is slashing");
    }

    public static  void damage(){
        if (isSharp) System.out.println("Sword damages more");
        else System.out.println("Sword damages more");
    }
    //non-static -> belong to the object. What does every sword do difference?
    // weight * length = 2 pounds * 10 inches = 20 points
    // weight * length = 10 pounds * 15 inches = 150 points
    public void harms(){
        System.out.println("Sword damages = " + (weight * length));

    }

    @Override
    public String toString() {
        return "Sword{" +
                "weight=" + weight +
                ", length=" + length +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
