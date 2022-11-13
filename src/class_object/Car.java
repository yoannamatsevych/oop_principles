package class_object;

public class Car {

    // default constractor

    public Car(){ //when you gonna create an overloaded in will gone

    }

    //Create a 5args overloaded constructor

    public Car(String color, String make,
               String model, int year, double price) {
        this.color = color; // if we will put "Red"  it a
        // lways  will "red"
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    //Instance variable

    public String color;// "Red" it's by default you can redo it
    public String make;
    public String model;
    public int year;
    public double price;

    //Override toString() method


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
