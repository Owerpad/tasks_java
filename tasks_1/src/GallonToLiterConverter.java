public class GallonToLiterConverter {
    public static double convertGallonsToLiters(int gallons) {
        double liters = gallons * 3.78541;
        return liters;
    }

    public static void main(String[] args) {
        int gallons = 5;
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
    }
}
