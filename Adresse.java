package aufgaben;

import java.util.Scanner;

/**
 * @author pd04381
 */
public class Adresse {
    private String strasse = "";

    private String plz = "";

    private String ort = "";

    /**
     * @param in
     */
    public Adresse(Scanner in) {
        System.out.print("Strasse: ");
        setStrasse(in.nextLine());
        System.out.print("PLZ: ");
        setPlz(in.nextLine());
        System.out.print("Ort: ");
        setOrt(in.nextLine());
    }

    /**
     * @param s
     * @param plz
     * @param o
     */
    public Adresse(String s, String plz, String o) {
        setStrasse(s);
        setOrt(o);
        setPlz(plz);
    }

    /**
     * @return the plz
     */
    public String getPlz() {
        return plz;
    }

    /**
     * @param p the plz to set
     */
    public void setPlz(String p) {
        if (p.length() == 5) {
            // this.plz = plz;
            plz = p;
        }
    }

    /**
     * @return the ort
     */
    public String getOrt() {
        return ort;
    }

    /**
     * @param o the ort to set
     */
    public void setOrt(String o) {
        if (o != null && !o.isEmpty()) {
            // this.ort = ort;
            ort = o;
        }
    }

    /**
     * @return the strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param s the strasse to set
     */
    public void setStrasse(String s) {
        if (s.length() > 2 && s != null) {
            strasse = s;
        }
    }

    /**
     * prints full Adress
     */
    public void print() {
        System.out.println(strasse + "\n" + plz + " " + ort);
    }

}
