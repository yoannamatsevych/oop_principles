package oop_principles.abstraction;

public interface Camera {

    void takesPhoto();
    void recordVideo();

    //this is default method type, access modifiier is public
    default void method1(){
        System.out.println("default method");
    }

    static void method2(){
        System.out.println("This is static method");
    }

}
