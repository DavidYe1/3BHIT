import java.util.Random;

/**
 * Created by @Autor david ye on @version 28.09.2016.
 */
public class IntArrayTest {
    private static int[] testArray1 = new int[10];

    public static void main(String[] args) {
        randomFill(testArray1);
        System.out.print(Utility.max(testArray1));
    }

    public static void randomFill(int[] ar1) {
        Random r = new Random();
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(100);
            System.out.print(ar1[i] + "  ");
        }
    }
}
