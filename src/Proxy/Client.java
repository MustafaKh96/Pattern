package Proxy;

public class Client {
    public static void main(String[] args){
        Student st1 = new Student("Mustafa");
        Bauer ba1 = new Bauer("Zakaria");
        Hochschule_BRS_Proxy hbrs_proxy_for_st= new Hochschule_BRS_Proxy(st1);
        Hochschule_BRS_Proxy hbrs_proxy_for_ba= new Hochschule_BRS_Proxy(ba1);
        hbrs_proxy_for_st.name();
        hbrs_proxy_for_ba.name();
    }
}
