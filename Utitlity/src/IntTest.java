/**
 * Created by @Autor david ye on @version 22.09.2016.
 * Hier testen wir alle methoden, an hand von int werten, die keine arrays verlangen.
 */
public class IntTest {
    /**
     * variable deklarieren und initialisieren
     */
    private static int testvar1 = (int) (Math.random() * 100); //zufallszahl
    private static int testvar2 = (int) (Math.random() * 100); //zufallszahl
    private static short fixvar1 = 8; //fixwert
    private static double fixvar2 = 12;//fixwert

    /**
     * @param args
     * testen aller methoden die kein array verlangen
     */
    public static void main(String[] args) {
        System.out.print(Utility.random(fixvar1, fixvar2) + " wurde zufaellig ausgewählt.\n" + //nimmt 2 fixwerte und gibt 1 zufällig zurück
                Utility.max(testvar1, testvar2) + " ist groeser als " + Utility.min(testvar1, testvar2) + "\n" + //vergleicht 2 zugällige zahlen
                "Die aus sage " + testvar1 + "=" + testvar2 + " ist " + ((Utility.equalTo(testvar1, testvar2)) ? "wahr." : "falsch.") + "\n" + //vergleicht ob 2 zufällige zahlen gleich sind
                "Die aus sage " + fixvar1 + "=" + fixvar1 + " ist " + ((Utility.equalTo(fixvar1, fixvar1)) ? "wahr." : "falsch.") + "\n" +  //sollte immer true zurück geben
                testvar1 + " ist " + ((Utility.isOdd(testvar1)) ? "ungerade." : "gerade."));//schaut of eine zufallszahl ungerade ist
    }
}
