package main.java.Polymorphism;

public class Kreis implements Form {

    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }
}
