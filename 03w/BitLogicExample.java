public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 || 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = " + (~45));

        System.out.println("=-------------------");

        byte recieveData = -120;

        int unsignedInt1 = recieveData & 255;
        System.out.println(unsignedInt1);

        int unsignedInt2 = Byte.toUnsignedInt(recieveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
