package loop_programs;
import java.util.Scanner;

public class FavoriteArtistLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        String artist;

        do {
            System.out.print("Enter your favorite music artist (or type 'exit' to stop): ");
            artist = input.nextLine().trim();

            if (!artist.equalsIgnoreCase("exit")) {
                count++;
                System.out.println("Stored artist: " + artist);
            }
        } while (!artist.equalsIgnoreCase("exit"));

        System.out.println("You entered " + count + " artists.");
        input.close();
    }
}
