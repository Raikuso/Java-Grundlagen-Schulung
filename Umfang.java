package aufgaben;

/**
 * @author pd04381
 */
public class Umfang {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        var radius = 12.4;
        System.out.printf("Umfang: %.2f%n", radius * 2 * Math.PI);
        System.out.printf("Fläche: %.2f%n", Math.pow(radius, 2) * Math.PI);
    }

}
