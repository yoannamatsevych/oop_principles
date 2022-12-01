package recap;

public class Dinosaur extends Animal{


    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct) {
        super(name, age, height, weight, diet, isAlive, isExtinct);
    }

    public Dinosaur(String name, int age, double height, double weight, String diet, boolean isAlive, boolean isExtinct, String size,
                    boolean hasSpike) {
        super(name, age, height, weight, diet, isAlive, isExtinct);
        this.size = size;
        this.hasSpike = hasSpike;
    }

    public static boolean isPeptile = true;

    public String size;
    public boolean hasSpike;

    @Override
    public String toString() {
        return "Dinosaur{" +
                "size='" + size + '\'' +
                ", hasSpike=" + hasSpike +
                ", name='" + name + '\'' +
                (isAlive ? ", age=" + age : "") +
                ", height=" + height +
                ", weight=" + weight +
                ", diet='" + diet + '\'' +
                ", isAlive=" + isAlive +
                ", isExtinct=" + isExtinct +
                '}';
    }

    public static void main(String[] args) {
        Dinosaur dinosaur = new Dinosaur("Trex", 6, 8.9, 500.3, "Carnivore", false, true,
                "Big", true);
        System.out.println(dinosaur);
    }

}
