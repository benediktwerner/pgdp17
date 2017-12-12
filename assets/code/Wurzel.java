public class Wurzel {
    // Iterative Version
    public static double heronIt(double a, double epsilon) {
        double x = a;
        while (Math.abs(x * x - a) > epsilon) {
            x = (x + a / x) / 2.0;
        }
        return x;
    }

    // Hilfsfunktion für rekursive Loesung
    private static double heronRecHelper(double x, double a, double epsilon) {
        if (Math.abs(x * x - a) >= epsilon) {
            return heronRecHelper((x + a / x) / 2.0, a, epsilon);
        }
        return x;
    }

    // Rekursive Variante
    public static double heronRec(double a, double epsilon) {
        return heronRecHelper(a, a, epsilon);
    }

    // Kleines Testprogramm
    public static void main(String[] args) {
        System.out.println(heronIt(2.0, 0.0001));
        System.out.println(heronRec(2.0, 0.0001));
    }
}
