package mutable_immutable;

public class Practice_stringBuilder {
    public static void main(String[] args) {

        StringBuilder city = new StringBuilder("Chicago");

        System.out.println(city);

        city = new StringBuilder("Miami");

        String name = "Alex";

        name +="ander";

        System.out.println(name);

        city.append("xxx");
        System.out.println(city);

    }
}
