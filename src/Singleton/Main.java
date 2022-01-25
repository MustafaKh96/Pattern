package Singleton;

public class Main {
    public static void main(String[] args){

        HBRS hbrs1 = HBRS.getInstance();
        HBRS hbrs2 = HBRS.getInstance();

        System.out.println(hbrs1.getName());
        System.out.println(hbrs2.getName());

        hbrs1.setAnmerkung("1");

        System.out.println(hbrs2.getAnmerkung());
    }
}