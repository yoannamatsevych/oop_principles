package class_object;

import java.util.ArrayList;
import java.util.Iterator;

public class CarTest {
    public static void main(String[] args) {

        Car car1 = new Car("White", "BMW", "X6", 2020, 15000);
        Car car2 = new Car("Black", "Tesla", "S", 2023, 20000);
        Car car3 = new Car("Beige", "Toyota", "Camry", 2018, 10000);
        Car car4 = new Car("Blue", "Tesla", "X", 2021, 13000);
        Car car5 = new Car("Black", "Audi", "A7", 2022, 15000);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        System.out.println("\n============Print each car==========\n");
        cars.forEach(System.out::println);

        /*
        Find most expensive car
        Remove car more than or equals then 20K
         */

       Car mostExpensiveCar = cars.get(0);


       for(Car car : cars){
           if(car.price > mostExpensiveCar.price) mostExpensiveCar = car;
       }

        System.out.println("\n" +mostExpensiveCar);

        int countBlackCars = 0;

        for (Car car : cars){
            if (car.color.equalsIgnoreCase("Black")) countBlackCars++;
        }
        System.out.println(countBlackCars);

        System.out.println(cars.stream().filter(car -> car.color.equalsIgnoreCase("Black")).count());


        /*
        Count all the cars that are Blue or Beige or 2023 ->
         */

        int count = 0;

        for (Car car : cars){
            if (car.color.equalsIgnoreCase("Blue")
                    || car.color.equalsIgnoreCase("Beige") ||
            car.year == 2023) count++;
        }
        System.out.println(count);


        /*
        Remove al the cars that are Tesla and size should be three
         */
//        Iterator<Car> carIterator = cars.iterator();
//
//        while(carIterator.hasNext()){
//            Car c = carIterator.next();
//            if(c.make.equalsIgnoreCase("Tesla")) carIterator.remove();
//        }
//        System.out.println(cars.size());

        cars.removeIf(car -> car.make.equalsIgnoreCase("Tesla"));

        System.out.println(cars.size());

    }
}
