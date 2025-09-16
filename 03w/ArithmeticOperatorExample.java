public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 10L;

        int result1 = v1 + v2;

        System.out.println("result1: " + result1);
        System.out.println("type is " + ((Object)result1).getClass().getSimpleName() + "\n");

        long result2 = v1 + v2 - v4;

        System.out.println("result2: " + result2);
        System.out.println("type is " + ((Object)result2).getClass().getSimpleName() + "\n");

        double result3 = (double) v1 / v2;

        System.out.println("result3: " + result3);
        System.out.println("type is " + ((Object)result3).getClass().getSimpleName() + "\n");

        int result4 = v1 % v2;

        System.out.println("result4: " + result4);
        System.out.println("type is " + ((Object)result4).getClass().getSimpleName() + "\n");
    }
}
