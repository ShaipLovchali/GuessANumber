import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int computersNumber = random.nextInt(100) + 1;

        System.out.print("Guess a number between 1 and 100: ");
        int playersNumber = Integer.parseInt(scanner.nextLine());

        while (playersNumber < 1 || playersNumber > 100) {
            System.out.print("Invalid input... Please enter a number between 1 and 100: ");
            playersNumber = Integer.parseInt(scanner.nextLine());
        }


        while (playersNumber != computersNumber) {
            if (playersNumber > computersNumber) {
                System.out.println("Lower");
            }else {
                System.out.println("Higher");
            }

            System.out.print("Guess a number between 1 and 100: ");
            playersNumber = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Congratulations!! You guessed it");
    }
}
