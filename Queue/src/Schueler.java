import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * schueler Model Klasse , welche Attribute f�r Vorname , Nachname ,
 * Geschlecht und Gebutrsdatum enth�lt.
 *
 * @author David Ye
 * @version 19.10.2016
 */
public class Schueler {
    private String famName;    //familienname
    private String vorName;    //Vorname
    private boolean gesch;    //true = weiblich , false = m�nnlich
    private Date gebDatum;    //Geburtsdatum

    public Schueler(String famName, String vorName, boolean gesch) {
        super();
        this.famName = famName;
        this.vorName = vorName;
        this.gesch = gesch;
    }

    /**
     * Methode , um das Datum zu setzen
     *
     * @param datum , das zu setzende Datum
     * @return true - wenn das Datum erfolgreich gesettet wurde
     * false - wenn nicht
     */
    public boolean setGebDatum(String datum) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            this.gebDatum = sdf.parse(datum);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * Methode welche den Familiennamen zur�ckgibt
     *
     * @return den Familiennamen
     */
    public String getFamName() {
        return this.famName;
    }

    /**
     * setter Methode f�r den Familienname
     *
     * @param famName , der zu setzende Familienname
     */
    public void setFamName(String famName) {
        this.famName = famName;
    }

    /**
     * Methode welche den Vornamen zur�ckgibt
     *
     * @return den Vornamen
     */
    public String getVorName() {
        return this.vorName;
    }

    /**
     * setter Methode f�r den Vornamen
     *
     * @param vorName , der zu setzende Vorname
     */
    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    /**
     * Methode welche das Geschlecht zur�ckgibt
     *
     * @return true - weiblich
     * false - m�nnlich
     */
    public String getGeschlecht() {
        if (this.gesch) return "weiblich";
        return "maennlich";
    }

    /**
     * setter Methode f�r das geschlecht
     *
     * @param gesch , das zu setzende Geschlecht (true - weiblich | false - m�nnlich)
     */
    public void setGeschlecht(boolean gesch) {
        this.gesch = gesch;
    }

    /**
     * Methode welche das Geburtdatum als String zur�ckgibt
     *
     * @return das Geburtsdatum
     */
    public String getGebDatum() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(this.gebDatum);
    }

    /**
     * Methode welche alle Attribute in der Konsole ausgibt
     */
    public String toString() {
        String s1 = this.famName + " " + this.vorName + " " + this.getGebDatum();
        if (this.gesch) s1 += "  w";
        if (!this.gesch) s1 += "  m";
        return s1;
    }
}
