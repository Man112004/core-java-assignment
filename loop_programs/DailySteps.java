package loop_programs;
public class DailySteps {
    public static void main(String[] args) {
        int[] steps = {8000, 12000, 9500, 14000, 11000, 9000, 13000};

        System.out.println("Daily step count for the week:");

        for (int i = 0; i < steps.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + steps[i] + " steps");
        }
    }
}
