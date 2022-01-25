package Adapter;

public class Fahrrad{

    public void losfahren() {
        System.out.println("Das Fahrrad fährt los.");
    }

    public void stoppen() {
        System.out.println("Das Fahrrad stoppt.");
    }

    public void hupen() {
        System.out.println("Das Fahrrad hupt.");
    }

    // Ich schreibe "Implements Fahrzeug" nicht, weil ich die Klasse nicht
    // ändern möchte. Die Klasse muss immer so aussehen.

}