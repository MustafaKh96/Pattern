package Factory;

public class Client {

    // Ich möchte in der Klasse Client ein Objekt der Klasse GermanTranslator
    // erstellen, ohne new in der Klasse Client zu vrewenden.

    public void übersetzen(int number){
        GermanTranslator germanTranslator = Factory.createGermanTranslator();
        System.out.println("Die Übersetzung der Nummer " + number + " ist : " + germanTranslator.translateNumber(number));
    }

    public static void main(String[] args){
        Client client = new Client();
        client.übersetzen(5);
    }
}