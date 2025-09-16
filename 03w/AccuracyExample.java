public class AccuracyExample {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7;
        double result = apple - number*pieceUnit;

        System.out.println("사과 1개에서 남은 양: " + result);
        System.out.println("--------------------");

        int apple2 = 1;
        int totalPieces = apple2 * 10;
        int number2 = 7;
        int result2 = totalPieces - number2;

        System.out.println("10조각에서 남은 조각: " + result2);
        System.out.println("사과 1개에서 남은 양: " + result2/10.0);
    }
}
