package Adapter;

public class FahrradAdapter implements Fahrzeug{

    private Fahrrad fahrrad;

    public FahrradAdapter(Fahrrad fahrrad){
        this.fahrrad = fahrrad;
    }


    @Override
    public void losfahren() {
        fahrrad.losfahren();
    }

    @Override
    public void stoppen() {
        fahrrad.stoppen();
    }

    @Override
    public void hupen() {
        fahrrad.hupen();
    }
}