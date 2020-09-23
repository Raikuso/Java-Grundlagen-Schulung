package aufgaben;

import java.util.Scanner;

/**
 * @author pd04381
 */
public class Compare {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        var var1 = 10;
        var var2 = 20;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Var1: ");
        var1 = scanner.nextInt();
        System.out.println("Var2: ");
        var2 = scanner.nextInt();

        if (var1 > var2) {
            System.out.println("The larger number is:" + var1);
        } else if (var2 > var1) {
            System.out.println("The larger number is:" + var2);
        } else {
            System.out.println("Equal.");
        }

        scanner.close();
    }

}
