package class_object;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Blue";

        Car car2 = new Car("black", "Tesla",
                "S", 2023, 20000);

        System.out.println(car1);
        System.out.println(car2);



    }
}
