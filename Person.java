package aufgaben;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author pd04381
 */
public class Person {
    private String name;

    private String vorname;

    private Date gebDatum;

    private SimpleDateFormat format = new SimpleDateFormat("dd.MM.YYYY");

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param vorname the vorname to set
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return the gebDatum
     */
    public Date getGebDatum() {
        return gebDatum;
    }

    /**
     * @param dat
     */
    public void setGebDatum(String dat) {
        try {
            gebDatum = new SimpleDateFormat("dd.MM.yyyy").parse(dat);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param in
     */
    public Person(Scanner in) {
        System.out.print("Vorname: ");
        setVorname(in.nextLine());
        System.out.print("Name: ");
        setName(in.nextLine());
        System.out.print("Geburtsdatum: ");
        setGebDatum(in.nextLine());
    }

    /**
     * @param name
     * @param vorname
     * @param gebDatum
     */
    public Person(String name, String vorname, String gebDatum) {
        setName(name);
        setVorname(vorname);
        setGebDatum(gebDatum);
    }

    /**
     * 
     */
    public void print() {
        System.out.printf("Personendaten:%n");
        System.out.printf("Name: %s%n", name);
        System.out.printf("Vorname: %s%n", vorname);
        System.out.printf("Geburtsdatum: %s%n", format.format(gebDatum));
    }

}
