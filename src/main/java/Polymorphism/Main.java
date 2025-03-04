package main.java.Polymorphism;

public class Main {

    public static void main(String[] args) {
        Form kreis = new Kreis(3);
        Form rechteck = new Rechteck(4, 5);

        System.out.println("Fläche kreis: " + kreis);
        System.out.println("Fläche Rechteck: " + rechteck);


        Fahrzeug auto = new Auto();
        Fahrzeug fahrzeug = new Fahrzeug();
        fahrzeug.beschleunigen();
        auto.beschleunigen();
    }
}
