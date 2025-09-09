public class FloatDoubleExample {
    public static void main(String[] args) {
        //float는 32bit, double은 64bit, double이 정밀도 더 높음
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;

        System.out.println(var1);
        System.out.println(var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;

        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }   
}
