package Factory;

public class Factory {
    // Die Methoden sollen static sein.

    public static GermanTranslator createGermanTranslator(){
        return new GermanTranslator();
    }

    // Oder implementieren wir in der Klasse GermanTranslator
    // ein Interface Translator.
    // und hier ist der Rückgabetyp der createGermanTranslator()
    // nicht GermanTranslator, sondern Translator.

}