package recap.abstraction;

public class Bird extends Creature implements Wings, Claws{

    public Bird(String name, int legs, String breathingMethod, String reproducingMethod) {
        super(name, legs, breathingMethod, reproducingMethod);
    }

    public Bird(String name, int legs, String breathingMethod, String reproducingMethod, boolean hasWings, boolean hasClaws) {
        super(name, legs, breathingMethod, reproducingMethod);
        this.hasWings = hasWings;
        this.hasClaws = hasClaws;
    }

    public boolean hasWings;
    public boolean hasClaws;

    @Override
    public void moving() {
        if(legs == 0) System.out.println(name + " cannot walk");

        if(hasWings) System.out.println(name + " is flying");
        else System.out.println(name + " does not have wings and can not fly");
    }

    @Override
    public void breathing() {
        switch(breathingMethod.toLowerCase()){
            case "lungs":
                System.out.println(name + " is air breathing");
                break;
            case "gills":
                System.out.println(name + " is water breathing");
                break;
            default:
                System.out.println("This breathing method doesn't exist");
        }
        System.out.println("It is using lungs to breath!");
    }

    @Override
    public void reproduction() {
        switch(reproducingMethod.toLowerCase()){
            case "eggs":
                System.out.println(name + " is using eggs for reproduction!");
                break;
            case "giving birth":
                System.out.println(name + " is giving birth for reproduction!");
                break;
            default:
                System.out.println("This reproduction method does not exist!");
        }
        System.out.println("Birds are laying eggs to their nests");
    }

    @Override
    public void fly() {
        if(hasWings) System.out.println(name + " fly");
        else System.out.println(name + " can not fly");
    }

    @Override
    public void grabs() {
        System.out.println(name + (hasClaws ? " can" : " can not") + " grab the branch!");
    }

    public static void main(String[] args) {
        Bird bird = new Bird("Eagle", 2, "lunds", "eggs", true, false);
        bird.moving();
        System.out.println();
        bird.breathing();
        System.out.println();
        bird.reproduction();
        System.out.println();
        bird.living();
        System.out.println();
        bird.grabs();
    }



}
