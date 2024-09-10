public class MaxNumberFinder {
    public static int findMax(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Большее число: " + findMax(a, b));
    }
}
