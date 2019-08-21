/*Marshall Miller
 *Intro to Java Block 2
 *Rock Paper Scissors
 *This program will pit a computer vs a player in a rock-paper-scissors tournament.
 */
 
 import java.util.Scanner;
 
 public class RockPaperScissors
 {
 	public static void main(String args[])
 	{
 		Scanner input = new Scanner(System.in);
 		boolean mainloop = true;
 		int userWin = 0, userLoss = 0, userTie = 0;
 		System.out.println("*****Welcome to West's Rock-Paper-Scissors Game*****");
 		while(mainloop)
 		{
 			System.out.print("Enter your play (R, P, or S) > ");
 			char userPlay = Character.toUpperCase(input.next().charAt(0));
 			int compNum = (int)(Math.random() * 3) + 1;
 			char compPlay;
 			switch(compNum)
 			{
 				case 1:
 					compPlay = 'R';
 					System.out.println("The computer played " + compPlay + ".");
 					switch(userPlay)
 					{
 						case 'R':
 							System.out.println("Tie!");
 							userTie++;
 							break;
 						case 'P':
 							System.out.println("Paper beats rock; you win!");
 							userWin++;
 							break;
 						case 'S':
 							System.out.println("Rock beats scissors; you lose!");
 							userLoss++;
 							break;
 						default:
 							System.out.println("That is an invalid move on your part!");
 							userLoss++;
 					}
 					break;
 				case 2:
 					compPlay = 'P';
 					System.out.println("The computer played " + compPlay + ".");
 					switch(userPlay)
 					{
 						case 'P':
 							System.out.println("Tie!");
 							userTie++;
 							break;
 						case 'S':
 							System.out.println("Scissors beats paper; you lose!");
 							userLoss++;
 							break;
 						case 'R':
 							System.out.println("Paper beats rock; you win!");
 							userWin++;
 							break;
 						default:
 							System.out.println("That is an invalid move on your part!");
 							userLoss++;
 					}
 					break;
 				case 3:
 					compPlay = 'S';
 					System.out.println("The computer played " + compPlay + ".");
 					switch(userPlay)
 					{
 						case 'S':
 							System.out.println("Tie!");
 							userTie++;
 							break;
 						case 'P':
 							System.out.println("Scissors beats paper; you lose!");
 							userLoss++;
 							break;
 						case 'R':
 							System.out.println("Rock beats scissors; you win!");
 							userWin++;
 							break;
 						default:
 							System.out.println("That is an invalid move on your part!");
 							userLoss++;
 					}
 					break;
 			}
 			System.out.println("User:         " + userWin + " Wins " + userLoss + " Losses " + userTie + " Ties");
 			System.out.println("Computer:     " + userLoss + " Wins " + userWin + " Losses " + userTie + " Ties");
 			System.out.print("Would you like to play again? (Y/N) > ");
 			char playAgain = Character.toUpperCase(input.next().charAt(0));
 			if(playAgain != 'Y')
 				mainloop = false;
 		}
 	}
 }