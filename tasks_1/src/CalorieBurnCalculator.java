public class CalorieBurnCalculator {
    public static int calculateCalories(int minutes, int intensity) {
        int caloriesPerMinute;
        switch (intensity) {
            case 1:
                caloriesPerMinute = 4;
                break;
            case 2:
                caloriesPerMinute = 8;
                break;
            case 3:
                caloriesPerMinute = 12;
                break;
            default:
                caloriesPerMinute = 0;
        }
        return caloriesPerMinute * minutes;
    }

    public static void main(String[] args) {
        int workoutMinutes = 30;
        int workoutIntensity = 2;
        int burnedCalories = calculateCalories(workoutMinutes, workoutIntensity);
        System.out.println("вы сожгли " + burnedCalories + " каллорий " + workoutMinutes + " минут(у)");
    }
}
