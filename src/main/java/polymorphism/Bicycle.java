package main.java.polymorphism;

public class Bicycle extends Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Slow acceleration");
    }
}
