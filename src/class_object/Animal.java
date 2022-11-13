package class_object;

public class Animal {

    // Create a constructor that take 2 args -> name and int
    public String name;
    public int age;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    public static final boolean isExtinct = true;

    public Animal(){

    }

    public Animal(String name, int age ){
        System.out.println("This is 2-args constractor");
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        this(name, age); // has to be first, so we can use only one inner object
        System.out.println("This is 5 args constructor");

        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    @Override
    public String toString() {

        String result = "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age;
        if (isCarnivore) result+= ", isCarnivore=" + isCarnivore;
        if (isHerbivore) result+= ", isHerbivore=" + isHerbivore;
        if (isOmnivore) result+=  ", isOmnivore=" + isOmnivore;

        result += "}";

        return result;

    }

    public static void main(String[] args) {
//        Animal a1 = new Animal("Cow", 5);
//        Animal a2 = new Animal("Dog", 3);
//        Animal a3 = new Animal("Cat", 1);
//        System.out.println(a1);
//        System.out.println(a2);

        Animal a4 = new Animal("Tigar", 10, true, false, false);
        Animal a5 = new Animal("Cow", 5, false, true, false);
        Animal a6 = new Animal("Cat", 2, false, false, true);
        System.out.println(a4);


        System.out.println("========Printing the object========\n");
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);

        System.out.println("======Static final instance variable========");
        System.out.println(Animal.isExtinct); // true

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);


    }

}
