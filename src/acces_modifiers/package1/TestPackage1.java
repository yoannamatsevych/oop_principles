package acces_modifiers.package1;

public class TestPackage1 {

    public static void main(String[] args) {

        Honda h1 = new Honda();

        System.out.println(h1);// acces_modifiers.package1.Honda@1540e19d

        Tesla t1 = new Tesla();

      //  Toyota to1 = new Toyota(); accesseble only for same class

        Toyota to1 = new Toyota();

        BMW b1 = new BMW();

    }

}
