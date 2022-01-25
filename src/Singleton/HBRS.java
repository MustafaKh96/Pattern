package Singleton;

public class HBRS {

    // Aus dieser Klasse kann nur ein einziges Objekt erzeugen.

    private static HBRS instance = null;

    private HBRS(){
    }

    public static synchronized HBRS getInstance(){
        if(instance == null){
            instance = new HBRS();
        }
        return instance;
    }


    private final String name = "Hochschule Bonn-Rhein-Sieg";
    public String getName() {
        return name;
    }



    private String anmerkung ;
    public void setAnmerkung(String anmerkung) {
        this.anmerkung = anmerkung;
    }

    public String getAnmerkung() {
        return anmerkung;
    }

}
