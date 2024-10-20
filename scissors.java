import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.println("Welcome to Rock, Paper, Scissors!");
      System.out.print("Enter your choice (rock, paper, scissors): ");
      String userChoice = scanner.next().toLowerCase();

      String[] choices = {"rock", "paper", "scissors"};
      String computerChoice = choices[random.nextInt(3)];

      System.out.println("Computer chose: " + computerChoice);

      if (userChoice.equals(computerChoice)) {
        System.out.println("It's a tie!");
      } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                 (userChoice.equals("scissors") && computerChoice.equals("paper")) ||
                 (userChoice.equals("paper") && computerChoice.equals("rock"))) {
        System.out.println("You win!");
      } else {
        System.out.println("Computer wins!");
      }
    } finally {
      if (scanner != null) {
        scanner.close();
      }
    }
  }
}