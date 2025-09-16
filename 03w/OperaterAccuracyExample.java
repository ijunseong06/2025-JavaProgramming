public class OperaterAccuracyExample {
    public static void main(String[] args) {
        float a = 0.1f;
        double b = 0.1;

        System.out.printf("a (float) = %.20f%n", a);
        System.out.printf("(double)a = %.20f%n", (double)a);
        System.out.printf("b (double) = %.20f%n", b);
        System.out.printf("(float)b = %.20f%n", (float)b);

        System.out.println("a == b : " + (a == b));
        System.out.println("a == (float)b: " + (a == (float)b));
        System.out.println("(double)a == b : " + ((double)a == b));
    }
}
