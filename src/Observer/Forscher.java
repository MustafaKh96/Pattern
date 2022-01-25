package Observer;

public class Forscher implements Beobachter{

    private String name;
    private Pinguin pinguin;

    public Forscher(String name, Pinguin pinguin){
        this.name = name;
        this.pinguin = pinguin;
        pinguin.regestriereBeobachter(this);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void update() {
        System.out.println("Der Forscher "+ name + " sieht," +
                " dass der Pinguin " + pinguin.getName() +" gerade " + pinguin.getAktion() +".");
    }
}