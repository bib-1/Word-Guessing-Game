/**Application Purpose: This is the main class for the game "Word Guessing"
 * Author: Bibek Poudel
 * Date: 12 April 2021
 * Time: 11:30 am
 */

//importing the Scanner from the util package to scan the player's input
import java.util.Scanner;

//the game class which contains the main method
public class Game {

    //the main method
    public static void main(String[] args) {

        //Requesting player's for their name
        System.out.println("Enter your name:");
        //initializing in for scanning name
        Scanner in = new Scanner(System.in);
        //creating gamer object to store the player's information
        Player gamer = new Player();
        //using setters to set player's name
        gamer.setPlayerName(in.nextLine());

        //Welcome message with the name of player
        System.out.println("Welcome to the word guessing game, " + gamer.getPlayerName());

        //while loop to continue the game until the player's wants (playGame == true) to be with game
        boolean playGame = true;
        while(playGame){

            //Choices to choose levels
            System.out.println("Choose the level of difficulty for the game:");
            System.out.println("Enter '1' for Easy");
            System.out.println(("Enter '2' for Medium"));
            System.out.println("Enter '3' for Hard");

            //initializing gameLevel object with new Level()
            Level gameLevel = new Level();

            //initializing variable to store level
            int level;

            //exception handling using try catch to deal with the error caused by wrong level input
            try{
                //storing the level chose by player
                level = in.nextInt();
            }
            catch (java.util.InputMismatchException e)
            {
                //re-prompts the user for level input
                System.out.println("Input the numeric value between 1-3");
                Scanner input = new Scanner(System.in);
                level = input.nextInt();
                input.close();
            }
            //if the numeric level input is still not matching with the levels
            //it again re-prompts user for input until the level is matched
            while (!Player.validatePlayerInput(level))
            {
                System.out.println("Give the numeric value between 1 to 3");
                Scanner put = new Scanner(System.in);
                level = put.nextInt();
            }
            //runs the level chosen by the player
            gameLevel.runlevel(level);

            //decides if the user wants to play the new game again
            playGame = gamer.playAgain();
        }
        //Displays the game over message after the game ends
        System.out.println("Game Over, "+ gamer.getPlayerName());
    }
}
