public class RevenueCalculator {
    public static double calculateTotalRevenue(int numberOfTickets, double ticketPrice) {
        return numberOfTickets * ticketPrice;
    }

    public static void main(String[] args) {
        int numberOfTickets = 150;
        double ticketPrice = 20.50;
        double totalRevenue = calculateTotalRevenue(numberOfTickets, ticketPrice);
        System.out.println("Общая выручка от продажи билетов составляет: " + totalRevenue + " рублей");
    }
}
