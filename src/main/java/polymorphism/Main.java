package main.java.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("Fläche circle: " + circle);
        System.out.println("Fläche Rechteck: " + rectangle);


        Vehicle car = new Car();
        Vehicle vehicle = new Vehicle();
        vehicle.accelerate();
        car.accelerate();
    }
}
