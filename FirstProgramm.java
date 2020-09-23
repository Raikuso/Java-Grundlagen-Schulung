package aufgaben;

import java.util.Locale;

/**
 * @author pd04381
 */
public class FirstProgramm {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int var1 = 4711;
        short var2 = 4711;
        long var3 = 47115563331641681L;
        byte var4 = 127;
        float var9 = 10.01f;
        double var10 = 50.04;
        char c = 'c';
        String var20 = "Test";
        var var30 = "var";

        System.out.println("var1: " + var1 + "\nvar2: " + var2 + "\nvar3: " + var3 + "\nvar4: " + var4);
        System.out.printf("var3: %d%n", var3);
        System.out.printf(Locale.US, "var9: %f%n", var9);
        System.out.println("var10: " + var10);
        System.out.println("var20: " + var20);
        System.out.println("c: " + c);
        System.out.println(var30);
    }

}
