import java.util.Scanner;

/**
 *
 * @author Lucky**************8
 * Section ?
 */
public class RockPaperScissors{

    //These are class constants (all methods in the class can see them)
    static final int ROCK = 1, PAPER = 2, SCISSORS = 3, YOU_WIN = 4, COMP_WIN = 5, DRAW = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput;
        int yourScore=0, compScore=0;
        int gameResult;

        System.out.println("========================");
        System.out.println("ROCK PAPER SCISSORS GAME");
        System.out.println("========================");
        System.out.println("\n Let's get started!");

        do {
            //calling the getGameResults method
            gameResult = getGameResults(scan);

            if (gameResult == YOU_WIN)
                yourScore++;
            else if(gameResult == COMP_WIN)
                compScore++;

            printCurrentScore(yourScore,compScore);//printing the score

            System.out.print("Do you want to play some more? (y or n): ");
            userInput = scan.next();

        } while (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes"));

        System.out.println("========GAME OVER=======");
        System.out.println("       FINAL SCORE:");
        printCurrentScore(yourScore,compScore);
    }


    /**
     This method "plays" the game.
     The input parameter is the Scanner object created in main()
     The method returns the int result of the game.
     */
    private static int getGameResults(Scanner scan) {
        int yourChoice, compChoice;
        //1. Prompt the user and use scan to read her input (R, P, or S)
        //...
        System.out.println("Enter R for Rock, P for Paper and S for Scissors");
        //2. Use a while loop to continue asking for user input if it is not 
        // one of the three above ("r", "p", or "s", ignoring case) 
        //...
        String userInput = "";
        int userIntInput = 0;
        while (true){
             userInput = scan.next();
             if(userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("S")){
                break;
             }
             System.out.println("BRRRZZZT!  Sorry, that entry is invalid. Try again ");
        }
        //3. Once the user input is satisfactory 
        //print out the choice (e.g. "You chose Rock!"),
        //translate it to one of the int constants (ROCK, PAPER, or SCISSORS),
        //and assign to yourChoice variable (e.g. yourChoice = ROCK)
        //...

        if(userInput.equalsIgnoreCase("R")){
            System.out.println("You chose Rock!");
            userIntInput = 1;
        }
        else if(userInput.equalsIgnoreCase("P")){
            System.out.println("You chose Paper!");
            userIntInput = 2;
        }
        else{
            System.out.println("You chose Scissors!");
            userIntInput = 3;
        }

        //4. Use Math.random() to randomly generate computer's choice
        //Remember, you need to split the range between 0 and 1 into
        // three equal intervals and if the random number is in one of them
        // assign a corresponding constant to compChoice.
        //Print out computer's choice as well.
        //...
        int computerInput = (int) (Math.random()*3)+1;
        if(computerInput == 1){
            System.out.println("Computer chose Rock!");
        }
        else if(computerInput == 2){
            System.out.println("Computer chose Paper!");
        }
        else{
            System.out.println("Computer chose Scissors!");

        }
        //Call the method decideWhoWon using yourChoice and compChoice as parameters

        int gameResult = decideWhoWon(userIntInput, computerInput);


        //return the game result to main() (just re-returning the results from decideWhoWon):
        return gameResult;

    }


    /**
     This method takes two int parameters yourChoice and compChoice,
     and returns the result of the game.

     It will return YOU_WIN if you win, COMP_WIN if computer wins
     and DRAW if it is a draw. (Remember, these are constants defined in this class)

     In addition, the method prints out the corresponding description of
     the result of the game e.g. "It's a draw!!",
     or "Scissors cut Paper! You WIN!".
     or "Rock is covered by Paper! You lose :(", and so on.
     */
    private static int decideWhoWon(int yourChoice, int compChoice) {
        //...
        if(yourChoice == compChoice){
            System.out.println("It's a draw!!");
            return 0;
        }
        else if((yourChoice == 1 && compChoice == 3) ){
            System.out.println("Rock blunts Scissors! You WIN!!");
            return 4;
        }
        else if (yourChoice == 2 && compChoice == 1){
            System.out.println("Paper holds Rock! You WIN!!");
            return 4;
        }
        else if(compChoice == 3 && yourChoice == 2){
            System.out.println("Scissors cut Paper! You LOSE!!");
            return 5;
        }
        else if((compChoice == 1 && yourChoice == 3) ){
            System.out.println("Rock blunts Scissors! You LOSE!!");
            return 5;
        }
        else if (compChoice == 2 && yourChoice == 1){
            System.out.println("Paper holds Rock! You LOSE!!");
            return 5;
        }
        else {
            System.out.println("Scissors cut Paper! You LOSE!!");
            return 5;
        }


    }


    /**
     This method takes in yourScore and compScore as parameters and prints
     them out in a formatted way, as shown in the project description.
     */
    private static void printCurrentScore(int yourScore, int compScore) {
        //...
        System.out.println("        You : Comp");
        System.out.println("SCORE:  -----------");
        System.out.println("       | "+yourScore+"  :  "+compScore+"  |");
        System.out.println("        -----------");


    }

}