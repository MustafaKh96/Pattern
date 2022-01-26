package AbstractFactory;

public class Poco implements MoebelFirma{
    @Override
    public Tisch createTisch(){
        return new AlterTisch();
    }

    @Override
    public Stuhl createStuhl(){
        return new AlterStuhl();
    }

    public static void main(String[] args){
        Poco poco = new Poco();
        Tisch t1 = poco.createTisch();
        t1.art();
    }
}