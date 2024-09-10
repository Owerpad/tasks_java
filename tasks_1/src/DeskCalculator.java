public class DeskCalculator {
    public static int calculateAdditionalDesks(int numberOfStudents, int availableDesks) {
        int requiredDesks = (int) Math.ceil((double) numberOfStudents / 2);
        return Math.max(0, requiredDesks - availableDesks);
    }

    public static void main(String[] args) {
        int numberOfStudents = 25;
        int availableDesks = 10;
        int additionalDesksNeeded = calculateAdditionalDesks(numberOfStudents, availableDesks);
        System.out.println("Не хватает столов: " + additionalDesksNeeded);
    }
}
