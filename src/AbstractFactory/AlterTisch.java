package AbstractFactory;

public class AlterTisch implements Tisch{

    @Override
    public void art(){
        System.out.println("Hier ist ein alte Tisch");
    }
}