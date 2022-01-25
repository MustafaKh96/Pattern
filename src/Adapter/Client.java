package Adapter;

public class Client {

    public static void spieleMitDemFahrzug(Fahrzeug fahrzeug){
        fahrzeug.losfahren();
        fahrzeug.hupen();
        fahrzeug.stoppen();
    }
    public static void main(String[] args){

        Fahrzeug auto = new Auto() ;
        spieleMitDemFahrzug(auto);

        // Fahrrad fahrrad = new Fahrrad();
        // spieleMitDemFahrzug(fahrrad);    --> ist ein Fehler.

        System.out.println("----------");

        Fahrzeug fahrrad = new FahrradAdapter(new Fahrrad());
        spieleMitDemFahrzug(fahrrad);
    }
}