package Factory;

public class GermanTranslator {

    public String translateNumber( int number ) {

        try {
            String[] a = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"} ;
            return a[number-1];
        }

        catch (Exception e) {
            return "Übersetzung der Zahl("+ number +") nicht möglich ";
        }

    }
}