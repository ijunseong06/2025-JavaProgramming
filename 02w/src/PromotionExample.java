public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        //byte < short, char < int < long < float < double
        //byte는 char로 변환될 수 없음
        //byte는 음수 포함, char는 음수 미포함

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("byteValue: " + byteValue + "\nintValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}
