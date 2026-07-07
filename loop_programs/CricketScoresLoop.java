package loop_programs;
public class CricketScoresLoop {
    public static void main(String[] args) {
        int[] scores = {45, 78, 102, 200, 55, 90, 40};

        System.out.println("Processing cricket scores:");

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];

            if (score < 50) {
                System.out.println("Skipping low score: " + score);
                continue;
            }

            if (score == 200) {
                System.out.println("Found 200! Stopping processing.");
                break;
            }

            System.out.println("Processing score: " + score);
        }
    }
}
