package aufgaben;

import java.util.Locale;
import java.util.Scanner;

/**
 * Kreisberechnung. Eingabe des Radius und berechnung der Fläche und Umfang des Kreises. Danach Ausgabe.
 * @author pd04381
 */
public class Kreis {
    double radius;

    /**
     * @param r Radius
     */
    public Kreis(double r) {
        setRadius(r);
    }

    /**
     * @param in Eingabevariable für Radius
     */
    public Kreis(Scanner in) {
        System.out.print("Radius: ");
        setRadius(in.nextDouble());
    }

    /**
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        if (radius > 0.) {
            this.radius = radius;
        } else {
            radius = 0.;
        }
    }

    /**
     * Berechnet Umfang Kreis
     * @return umfang
     */
    public double berechneUmfang() {
        return radius * 2 * Math.PI;
    }

    /**
     * berechnet Flaeche Kreis
     * @return flaeche
     */
    public double berechneFlaeche() {
        return Math.pow(radius, 2) * Math.PI;
    }

    /**
     * Ausgabe der Eigenschaften des Objekts. Radius, Umfang, Flaeche.
     * @param i Kreisnummer
     */
    public void print(int i) {
        System.out.printf(Locale.US, "%n%d. Kreis%nRadius:    %10.2f%n", i, radius);
        System.out.printf(Locale.US, "Umfang:    %10.2f%nFlaeche:    %10.2f%n", berechneUmfang(), berechneFlaeche());
    }

    /**
     * Ausgabe der Eigenschaften des Objekts. Radius, Umfang, Flaeche.
     */
    public void print() {
        System.out.printf(Locale.US, "%nKreis%nRadius:    %10.2f%n", radius);
        System.out.printf(Locale.US, "Umfang:    %10.2f%nFlaeche:    %10.2f%n", berechneUmfang(), berechneFlaeche());
    }

    @SuppressWarnings("javadoc")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        Kreis k1 = new Kreis(in);
        k1.print(1);
        k1.print();
    }

}
