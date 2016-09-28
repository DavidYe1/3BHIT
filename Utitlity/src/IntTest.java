/**
 * Created by David Ye on 22.09.2016.
 */
public class IntTest {
    private static int testvar1 = (int) (Math.random() * 100);
    private static int testvar2 = (int) (Math.random() * 100);
    private static int fixvar1 = 8;
    private static int fixvar2 = 12;

    public static void main(String[] args) {
        System.out.print(Utility.random(fixvar1, fixvar2) + " wurde zufaellig ausgewählt.\n" +
                Utility.max(testvar1, testvar2) + " ist groeser als " + Utility.min(testvar1, testvar2) + "\n" +
                "Die aus sage " + fixvar1 + "=" + fixvar2 + " ist:" + Utility.equalTo(fixvar1, fixvar2) + "\n" +
                "Die aus sage " + fixvar1 + "=" + fixvar1 + " ist:" + Utility.equalTo(fixvar1, fixvar1) + "\n");
    }
}
