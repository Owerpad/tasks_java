public class TriangleType {
    public static String determineTriangleType(int X, int Y, int Z) {
        if (X + Y <= Z || X + Z <= Y || Y + Z <= X) {
            return "Не является треугольником";
        } else if (X == Y && Y == Z) {
            return "Равносторонний";
        } else if (X == Y || Y == Z || X == Z) {
            return "Равнобедренный";
        } else {
            return "Разносторонний";
        }
    }

    public static void main(String[] args) {
        int X = 5;
        int Y = 5;
        int Z = 8;
        System.out.println("Тип треугольника: " + determineTriangleType(X, Y, Z));
    }
}
