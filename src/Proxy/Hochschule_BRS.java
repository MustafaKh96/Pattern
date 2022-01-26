package Proxy;

public class Hochschule_BRS implements Hochschule{
    @Override
    public void name(){ // Hier dürfen nur registrierte User zugreifen.
        System.out.println("Hochschule Bonn Rhein Sieg");
    }
}
