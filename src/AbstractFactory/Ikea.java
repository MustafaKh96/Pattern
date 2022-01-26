package AbstractFactory;

public class Ikea implements MoebelFirma {
    @Override
    public Tisch createTisch(){
        return new ModernerTisch();
    }

    @Override
    public Stuhl createStuhl(){
        return new ModernerStuhl();
    }

    public static void main(String[] args){
        Ikea ikea = new Ikea();
        Tisch t1 = ikea.createTisch();
        t1.art();
    }
}