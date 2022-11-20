package abu_talha;

import java.util.Random;
import java.util.Scanner;
public class at_41practise {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper
        //2 for seaser
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock: 1 for paper:  2 for Scissor:");
        int userInput = sc.nextInt(3);

        Random random = new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("you win!");
        }else {
            System.out.println("computer win");
        }
        System.out.println("comuter choice "+ computerInput);

    }
}
