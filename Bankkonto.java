package aufgaben;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author pd04381
 */
public class Bankkonto {
    private String iban;

    private double stand;

    private Date datum;

    private Person inh;

    private SimpleDateFormat format = new SimpleDateFormat("dd.MM.YYYY");

    Bankkonto(Scanner in) {
        stand = 2000.;
        System.out.print("IBAN: ");
        setIban(in.nextLine());
        System.out.print("Datum: ");
        setDatum(in.nextLine());
    }

    Bankkonto(String ib, String dat) {
        stand = 2000.;
        setIban(ib);
        setDatum(dat);
    }

    /**
     * @return the iban
     */
    public String getIban() {
        return iban;
    }

    /**
     * @param iban the iban to set
     */
    private void setIban(String iban) {
        if (iban != null && iban.length() == 22) {
            this.iban = iban;
        } else {
            iban = "DE00000000000000000000";
        }
    }

    /**
     * @return the stand
     */
    public double getStand() {
        return stand;
    }

    /**
     * @return the datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum the datum to set
     */
    public void setDatum(Date datum) {
        if (datum != null) {
            this.datum = datum;
        } else {
            datum = new Date();
        }
    }

    /**
     * @param dat
     */
    public void setDatum(String dat) {
        try {
            datum = new SimpleDateFormat("dd.MM.yyyy").parse(dat);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return inh;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.inh = person;
    }

    /**
     * Betrag Buchen (+/-) Limit -2000
     * @param b zu buchender Betrag
     * @return r gibt zurück ob Buchung erfolgreich
     */
    public boolean buche(double b) {
        boolean r = false;
        if (stand + b >= -2000) {
            stand += b;
            r = true;
        } else {
            r = false;
        }
        return r;

    }

    /**
     * 
     */
    public void print() {
        System.out.printf("Kontodaten:%n");
        System.out.printf("IBAN: %s%n", iban);
        System.out.printf("Stand: %f%n", stand);
        System.out.printf("Erstelldatum: %s%n", format.format(datum));
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person p = new Person("Salzmann", "Nick", "03.10.1997");
        Adresse a = new Adresse("Luchsweg 3", "75378", "Bad Liebenzell");
        Bankkonto b = new Bankkonto("DE12345678912345678912", "22.09.2020");
        // Scanner in = new Scanner(System.in);
        // Bankkonto b1 = new Bankkonto(in);
        // Person p1 = new Person(in);
        // Adresse a1 = new Adresse(in);
        // in.close();
        b.print();
        p.print();
        a.print();
        System.out.println(b.buche(3000.) ? "Buchung ok" : "Buchung Fehlgeschlagen");
        System.out.println(b.stand);
    }

}
