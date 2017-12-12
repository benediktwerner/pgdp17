public class Pi {
    // Kompakt
    public static double piRec(int n) {
        if (n == 0) {
            return 4.0;
        }
        else {
            // +/-4 == (4-8*(n%2))
            return (4 - 8 * (n % 2)) / (2 * n + 1.0) + piRec(n - 1);
        }
    }

    // Alternative
    public static double piRec2(int n) {
        if (n ==  0)
            return 4;
        if (n % 2 == 0)
            return  4.0 / (2 * n + 1) + piRec2(n - 1);
        else
            return -4.0 / (2 * n + 1) + piRec2(n - 1);
    }


    // Iterative Loesung
    public static double piIt(int n) {
        double pi = 0.0;
        double f = 4.0;

        for (long i = n; i >= 0; i--) {
            pi += f / (2 * i + 1);
            f = -f;
        }
        return pi;
    }

    public static void main(String[] args) {
        System.out.println("rec1: " + piRec(1000));
        System.out.println("rec2: "+ piRec2(1000));
        System.out.println("it:   "+ piIt(1000));
        System.out.println("pi:   " + Math.PI);
    }
}
