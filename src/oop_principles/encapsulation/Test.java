package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {


        AccountHolder accountHolder = new AccountHolder();

     //   accountHolder.firstName = "John";
        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "312-000-0000";

        accountHolder.setSSN("000-00-0000");
     //   System.out.println(accountHolder.firstName);

        System.out.println(accountHolder.getSSN());
        System.out.println(accountHolder);

        //accountHolder.firstName = "John";
        //System.out.println(accountHolder.firstName);

        accountHolder.setFirstName("John", "1234");
        System.out.println(accountHolder.getFirstName("5555"));
    }
}
