package aufgaben;

/**
 * @author pd04381
 */
public class Schueler1bis100 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        final var MAX = 100;
        long sum = 0L;
        // so wie der Lehrer es wollte
        for (int i = 0; i <= MAX;) {
            sum += i++;
        }
        System.out.println(sum);
        System.out.println("-----------");

        // so wie der Schüler es tatsächlich machte (die beste lösung 8D)
        System.out.println((MAX + 1) * MAX / 2);
    }

}
