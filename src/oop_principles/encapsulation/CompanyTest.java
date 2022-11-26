package oop_principles.encapsulation;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = new Company();
        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhone("(123) 312-2345");

        Company company2 = new Company("Google", "California", "(000) 055-5555");
        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhone("(000) 055-5555");

        System.out.println("Company 1 is = \"" + company1.getName() + "\" and company 2 is = \"" + company2.getName() + "\".");

    }
}
