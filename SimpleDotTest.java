import java.util.*;

public class SimpleDotTest {
    public static void main (String[] args) {

        int numOfGuesses = 0;
        boolean isAlive = true;
        GameHelper helper = new GameHelper();

        SimpleDot dot = new SimpleDot();

        int startCell = (int) (Math.random() * 4);
        String cell = Integer.toString(startCell);

        ArrayList<String> locations = new ArrayList<String> (
            Arrays.asList(
            cell,
            String.valueOf(startCell + 1),
            String.valueOf(startCell + 2))
        );

        dot.setLocationCells(locations);

        while(isAlive) {
            String userGuess = helper.readGuess();
            String result = dot.checkInput(userGuess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("Wiped!");
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }

    }
    
}