package Observer;

import java.util.ArrayList;
import java.util.List;

public class Pinguin implements Subjekt{

    private List<Beobachter> beobachterlist = new ArrayList<Beobachter>();
    private String name;
    private String aktion;
    // Die Aktion wird nicht in der Konstruktur übergeben, sondern mit set-Methode,
    // weil ich nach der Aktion die Methode update() aufrufen möchte.

    public Pinguin(String name){
        this.name = name;
    }

    @Override
    public void regestriereBeobachter(Beobachter beobachter){
        this.beobachterlist.add(beobachter);
    }
    @Override
    public void entferneBeobachter(Beobachter beobachter){
        this.beobachterlist.remove(beobachter);
        System.out.println("Der Forscher " + beobachter.getName() +" wurde entfernt.");
    }
    @Override
    public void benachrichtigeBeobachter(){
        for (Beobachter beobachter : beobachterlist){
            beobachter.update();
        }
    }

    public void setAktion(String aktion){
        this.aktion = aktion;
        this.benachrichtigeBeobachter();
    }

    public String getAktion(){
        return aktion;
    }
    public String getName(){
        return name;
    }

}
