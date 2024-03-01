import java.util.Random;
import java.util.Scanner;
 class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         Random ran = new Random();

         System.out.println("Welcome to Rock, Paper, Scissors!");
         System.out.println("Enter your move (rock, paper, or scissors): ");
         String userMove = sc.nextLine().toLowerCase();

         if (!(userMove.equals("rock")) && !(userMove.equals("paper")) && !(userMove.equals("scissors"))) {
             System.out.println("Invalid move. Please enter either rock, paper, or scissors.");
         }

         String[] moves = {"rock", "paper", "scissor"};
         int computerIndex = ran.nextInt(3);
         String computerMov = moves[computerIndex];

         System.out.println("Computer's move: " + computerMov);


         if (userMove.equals(computerMov)) {
             System.out.println("It's a tie!");
         } else if ((userMove.equals("rock") && computerMov.equals("scissors")) || (userMove.equals("paper") && computerMov.equals("rock")) || (userMove.equals("scissors") && computerMov.equals("paper"))) {
             System.out.println("You win!");}
         else {
             System.out.println("Computer wins!");
         }

     }
 }
