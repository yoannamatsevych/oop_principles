package acces_modifiers.package1;

public class BMW {

    // make, model, year, price

    public String make;

    protected String model;

    int year;

    private double price;

    private void privateMethod(){

    }

    protected  void protectedMethod(){

    }

    void defaultMethod(){

    }

    public void publicMethod(){

    }

    public static void main(String[] args) {
        BMW b1 = new BMW();


    }


}
