public class FactorialCalculator {
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал числа " + number + " равен " + calculateFactorial(number));
    }
}
