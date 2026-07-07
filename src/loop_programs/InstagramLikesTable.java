package loop_programs;
import java.util.Random;

public class InstagramLikesTable {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Instagram likes table:");

        for (int week = 1; week <= 4; week++) {
            System.out.println("Week " + week + ":");
            for (int day = 1; day <= 7; day++) {
                int likes = random.nextInt(501);
                System.out.printf("Day %d: %d likes\t", day, likes);
            }
            System.out.println();
        }
    }
}
