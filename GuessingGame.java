import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String args[]){    
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        final int max = 100;
        
        int counter = 1;
        playGame(input,rand, max);
        //guessingNumberGame(max, counter);
        
    } 
  
    public static void guessingNumberGame( int max, int counter){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String prompt = "y";                      
         
        
        // Generate the numbers
        
        
        while (prompt.toLowerCase().startsWith("y")){
            int target = rand.nextInt(max);
            
            //creating a flag to control inner loop
            int correct = 0;
            System.out.println("I'm thinking of a number between 1 and " + max + "...");
            //creates a new target number
            while (correct==0){
                
                System.out.print("Your guess? ");       //while it's yes, user inputs guess
                int guess = input.nextInt();
   
                if (guess < 1 || guess > max) {                       //if guess is not in the range, has to guess a valid number
                    System.out.println("Invalid guess! Guess again!");
                    continue;
                }
   
                if (guess < target) {
                    System.out.println("It's higher.");
                } else if (guess > target) {
                    System.out.println("It's lower.");
                } else {
                    System.out.println("You got it right in " + counter + " guesses!");
                    break;
                }
                counter++;
            }
            //restarts counter
            counter = 1;              
            System.out.println("Do you want to play again? ");
            prompt = input.next();
            //space for next game
            System.out.println();
        }
    }

//plays a single game and returns the number of guesses in that game
    public static int playGame(Scanner input, Random rand,int max){
        
        int target = rand.nextInt(max);
        int counter = 1;
        
        int correct = 0;
        System.out.println("I'm thinking of a number between 1 and " + max + "...");
        
        while (correct==0){
            System.out.print("Your guess? ");       //while it's yes, user inputs guess
            int guess = input.nextInt();
   
            if (guess < 1 || guess > max) {                       //if guess is not in the range, has to guess a valid number
                System.out.println("Invalid guess! Guess again!");
                continue;
            }
   
            if (guess < target) {
                System.out.println("It's higher.");
            } else if (guess > target) {
            System.out.println("It's lower.");
            } else {
                System.out.println("You got it right in " + counter + " guesses!");
                break;
        }
        counter++;
    }
    return counter;
    }

    public static boolean playAgain(Scanner input){
        System.out.println("Do you want to play again? ");
        String prompt = input.next();
        if (prompt.toLowerCase().startsWith("y")){
            System.out.println();
            return true;
        }
        return false;
    }

    public static void playGuessingGames(int counter){
        String prompt = "y"; 
        while(prompt.toLowerCase().startsWith("y")){
            playGame(null, null, 0);
            counter = 1;
            playAgain(null);
        }
    }

// main method which has the while loop to play a number of guessing games
//It calls the methid playGame to play a single game inside this loop
// It collects the statistics and calls the printStatistics method after all the games are played
//public static void playGuessingGames();
//play a single game and return the number of guesses in that game
//public static int playGame(Scanner input, Random r);
//print the final statistics after all the games are played
 //public static void printStatistics(int numOfGames, int totalGuesses,int bestGame);
  // prints the given message using System.out.print
  //public static void display(String message);
  //get user response if 'y' return true else false, calls getAnswer method
  //public static boolean playAgain(Scanner input)
  }
  // get a string input from user and return first character in lowercase
  //public static char getAnswer(Scanner input);


        
 
    
  

