public class CastingExample {
    public static void main(String[] args) {

        //int를 byte로 변환
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        //long을 int로 변환
        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        //int를 char로 변환
        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        //double을 int로 변환
        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
