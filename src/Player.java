/**Application Purpose: To create a level class which contains the information a player
 * Author: Bibek Poudel
 * Date: 12 April 2021
 * Time: 11:30 am
 */

//importing scanner to take user's input
import java.util.Scanner;

//this is player class
public class Player {

    //instance variable which store the player's name
    private String playerName;

    //class variable to store the players life
    public  static int playerLife = 10;

    //setter method to set the player's name
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    //getter method to return player name
    public String getPlayerName() {
        return playerName;
    }

    //a static method which checks if the level chosen by player is valid or not
    public static boolean validatePlayerInput(int choseLevel)
    {
        //stores the result in isValidated
        boolean isValidated = false;

        //if choseLevel is matched the isValidated world be true and an appropriate message would be displayed
        if(choseLevel == 1 || choseLevel == 2 || choseLevel == 3)
        {
            isValidated = true;
            //switch statement to display message depending on the level chosen
            switch (choseLevel)
            {
                case 1:
                    System.out.println("You chose easy level");
                    break;
                case 2:
                    System.out.println("You chose medium level");
                    break;
                case 3:
                    System.out.println("You chose difficult level");
                    break;
            }
            System.out.println("Let's start the game.");
        }
        //returns the result
        return isValidated;
    }

    //this method asks players to play again and returns the decision made by player
    public boolean playAgain()
    {
        //isPlayingAgain stores the decision made by player
        boolean isPlayingAgain = false;

        //isInputValid keeps record that the input is valid or not
        boolean isInputValid = false;

        //scanner to scan user's input
        Scanner input = new Scanner(System.in);

        //this do while loop repeats until the the inout is valid
        do{
            //asks the player if they want to play again
            System.out.println(getPlayerName() + ", Do you wanna play again? (yes/no)");
            //decision stores their result
            String decision = input.nextLine();

            //these if statements checks if the input matched with the expected input
            //if input is yes or y
            if(decision.equalsIgnoreCase("yes") || decision.equalsIgnoreCase("y"))
            {
                //it is true that player would be playing again
                isPlayingAgain  = true;
                //it is true that input is valid
                isInputValid = true;
            }
            //if input is no or n
            if(decision.equalsIgnoreCase("no") || decision.equalsIgnoreCase("n"))
            {
                isPlayingAgain = false;
                isInputValid = true;
            }
            //while checks if the input is valid or not before terminating the loop
        }while(!isInputValid);

        //returns whether the player is playing again or not
       return isPlayingAgain;
    }
}
