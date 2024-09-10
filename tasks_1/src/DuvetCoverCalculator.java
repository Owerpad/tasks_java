public class DuvetCoverCalculator {
    public static int calculateDuvetCovers(double fabricLength, double width, double height) {
        double availableFabric = fabricLength * 2;
        double duvetArea = width * height;
        return (int) (availableFabric / duvetArea);
    }

    public static void main(String[] args) {
        double fabricLength = 20; // длина ткани в метрах
        double width = 2;  // ширина пододеяльника в метрах
        double height = 2; // длина пододеяльника в метрах
        int duvetCovers = calculateDuvetCovers(fabricLength, width, height);
        System.out.println("Количество пододеяльников: " + duvetCovers);
    }
}

