/**
 * Created by David Ye on 22.09.2016.
 */
public class Test {
    private static int testvar1 = (int) (Math.random() * 10);
    private static int testvar2 = (int) (Math.random() * 10);
    private static int fixvar1 = 8;
    private static int fixvar2 = 12;

    public static void main(String[] args) {
        System.out.println(Utility.random(fixvar1, fixvar2" wurde zufällig ausgewählt."));
        System.out.println(Utility.max());
    }
}
