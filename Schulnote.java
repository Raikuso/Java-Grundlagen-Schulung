package aufgaben;

import java.util.Scanner;

/**
 * @author pd04381
 */
public class Schulnote {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int note;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Note eingeben: ");
            note = in.nextInt();

            switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
            default:
                System.out.println("Ungültige Eingabe");
                break;
            }
        } while (note > 6 || note < 1);

        in.close();
    }

}
