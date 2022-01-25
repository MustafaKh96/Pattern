package Observer;

public class Main {

    public static void main(String[] args){

        Pinguin pinguin1 = new Pinguin("A");
        Pinguin pinguin2 = new Pinguin("B");
        Forscher forscher1 = new Forscher("Abo Ali", pinguin1);
        Forscher forscher2 = new Forscher("Abo Yazan", pinguin1);
        Forscher forscher3 = new Forscher("Jemmi", pinguin2);

        pinguin1.setAktion("schläft");
        pinguin2.setAktion("läuft");
        pinguin2.entferneBeobachter(forscher3);
    }
}