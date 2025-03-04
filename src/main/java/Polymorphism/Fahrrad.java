package main.java.Polymorphism;

public class Fahrrad extends Fahrzeug {

    @Override
    public void beschleunigen() {
        System.out.println("langsame beschleunigung");
    }
}
