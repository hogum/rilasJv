public class SimpleDotTest {
    public static void main (String[] args) {

        int numOfGuesses = 0;
        boolean isAlive = true;
        Gamehelper helper = new Gamehelper();

        SimpleDot dot = new SimpleDot();

        int startCell = (int) (Math.random() * 4);

        int[] locations = {
            startCell,
            startCell + 1,
            startCell + 2};

        dot.setLocationCells(locations);

        while(isAlive) {
            String userGuess = helper.readGuess.next();
            String result = dot.checkInput(usserGuess);
            numOfGuesses++;

            if (result.equals("kill")) {
                isAlive = false;

                System.out.println("Wiped!");
                System.out.println("You took " + numOfGuesses + " guesses");
            }

        }

    }
    
}