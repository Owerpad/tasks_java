public class NODCalculator {
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        System.out.println("Наибольший общий делитель чисел " + a + " и " + b + " равен " + findGCD(a, b));
    }
}
