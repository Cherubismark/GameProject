import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Random rand = new Random();
        int compChoice = rand.nextInt(3);
        System.out.println(compChoice);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 0 for rock, 1 for paper, and 2 for scissors: ");
        int input = sc.nextInt();
        while (input !=99);
        {
            if (input == compChoice) {
                System.out.println("you and the computer have picked the same option");
            } else if ((compChoice == 0 && input == 2) || (compChoice == 1 && input == 0) || (compChoice == 2 && input == 1)) {
                System.out.println("you lost!");
            } else
                System.out.println("you win!");
            System.out.println(input);
            System.out.println("enter 0 for rock, 1 for paper, and 2 for scissors: ");
            input = sc.nextInt();
        }
    }


}
