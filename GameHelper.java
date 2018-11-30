import java.util.Scanner;


public class GameHelper {

    Scanner readUserGuess = new Scanner(System.in);

    public String readGuess() {
        System.out.println("Give me a Guess");
        String guess = readUserGuess.nextLine();

        return guess;
    }

}