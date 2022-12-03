package oop_principles.abstraction;

public class Samsung extends Phone implements Camera, WiFi{
public Samsung(){}

    public Samsung(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    public int storage;
    public String model;
    public String color;
    public double price;



    @Override
    public void call() {
        System.out.println("Samsung way of call");
    }

    @Override
    public void text() {
        System.out.println("Samsung way of text");
    }

    @Override
    public void takesPhoto() {
        System.out.println("Samsung is taking photos");
    }

    @Override
    public void recordVideo() {
        System.out.println("Samsung is recording videos");
    }

    @Override
    public void connect() {
        System.out.println("Samsung way of WiFi connection");
    }
}
