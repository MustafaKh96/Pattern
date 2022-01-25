package Adapter;

public class Auto implements Fahrzeug{


    @Override
    public void losfahren() {
        System.out.println("Das Auto fährt los.");
    }

    @Override
    public void stoppen() {
        System.out.println("Das Auto stoppt.");
    }

    @Override
    public void hupen() {
        System.out.println("Das Auto hupt.");
    }
}