import java.util.Random;

/**
 * testet alle Utility methoden die arrays verwenden
 * Created by @Autor david ye on @version 28.09.2016.
 */
public class IntArrayTest {
    private static final Integer[] testArray1 = new Integer[10]; //10 stelliges array erstellen
    private static final Integer[] nullArray = null;

    public static void main(String[] args) {
        try {
            randomFill();// array füllen
            System.out.print("Die größte Zahl ist" + Utility.max(testArray1) + "\n" +
                    "Die kleinste Zahl ist" + Utility.min(testArray1) + "\n" +
                    Utility.random(testArray1) + " wurde zufällig gewählt.");
            System.out.println(Utility.max(nullArray));
        } catch (NullPointerException e) {
            System.out.println("\n NullPointer!");

        }
    }

    /**
     * Erstellt random zahlen und füllt ein array damit
     */
    private static void randomFill() {
        Random r = new Random();
        for (int i = 0; i < IntArrayTest.testArray1.length; i++) {
            IntArrayTest.testArray1[i] = r.nextInt(100);
            System.out.print(IntArrayTest.testArray1[i] + "  ");
        }
    }
}
