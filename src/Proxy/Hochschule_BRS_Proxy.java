package Proxy;

public class Hochschule_BRS_Proxy implements Hochschule{
    private Object obj;
    private Hochschule_BRS hbrs = new Hochschule_BRS();

    Hochschule_BRS_Proxy(Object obj){
        this.obj = obj;
    }

    @Override
    public void name(){
        if(obj instanceof Student){
            hbrs.name();
        }
        else{
            System.out.println("Sie dürfen den Namen der Hochschule nicht anschauen");
        }
    }
}