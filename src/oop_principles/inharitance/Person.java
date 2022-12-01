package oop_principles.inharitance;

public class Person {

    // default constructor
    public Person(){

    }

    // 2-args constructor with fName and age

    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }

    // 3-args fName , age, DOB

    public Person(String fName, int age, String DOB) {
        this(fName, age);
        this.DOB = DOB;
    }

    //4-args fName, age, DOB, SSN

    public Person(String fName, int age, String DOB, String SNN) {
        this(fName, age, DOB);
        this.SNN = SNN;
    }

    // instance variable

    public String fName;
    protected int age;
    String DOB;
    private String SNN;

    public String getSNN() {
        return SNN;
    }

    public void setSNN(String SNN) {
        this.SNN = SNN;
    }

    public void eat(){
        System.out.println("Person eats");
    }

    //Overload eat method with string argument

    public void eat(String str){
        System.out.println("Person eats " + str);
    }

    public void sleep(){
        System.out.println("Person sleeps");
    }

    // Overloaded sleep method with int args
    public void sleep (int hours){
        System.out.println("Preson sleeps " + hours + " hours");
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SNN='" + SNN + '\'' +
                '}';
    }
}
