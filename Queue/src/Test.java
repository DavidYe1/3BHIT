/**
 * Created by david on 19.10.2016.
 */
public class Test {

    public static void main(String[] args) {
        MyLinkedQueue<Schueler> ll = new MyLinkedQueue<Schueler>();
        // erszeugt hier schüler
        for (int i = 0; i < 100; i++) {
            ll.append(new Schueler("Schueler" + i, "Schueler" + i, true));
        }
        //listet die schüler auf
        for (Schueler item : ll) {
            System.out.println(item.getFamName());
        }
    }
}
