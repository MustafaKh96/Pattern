package Observer;

public interface Subjekt {
    void regestriereBeobachter(Beobachter beobachter);
    void entferneBeobachter(Beobachter beobachter) ;
    void benachrichtigeBeobachter();
}