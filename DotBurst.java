import java.util.*;

public class DotBurst {
    
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleDot> dotList = new ArrayList<SimpleDot>();
    int numOfGuesses = 0;

    private void setUpGame() {
        SimpleDot firstDot = new SimpleDot();
        SimpleDot secondDot = new SimpleDot();
        SimpleDot thirdDot = new SimpleDot();

        dotList.addAll(
            Arrays.asList(
                firstDot,
                secondDot,
                thirdDot));

        System.out.println("Soo, you are here to sink three dot thingys");
        System.out.println("Thingy Boss, Thingy Cow, Thingy Blue");
        System.out.println("Few guesses mean you are cool");

        for (SimpleDot currentDot: dotList) {
            ArrayList<String> newLocation = helper.placeDot(3);
            currentDot.setLocationCells(newLocation);
        }

    }

    private void startGame() {
        while (!dotList.isEmpty()) {
            String userGuess =  helper.readGuess();
            checkInput(userGuess);
        }

        finishGame();
    }

    private void checkInput(String guess) {
        numOfGuesses++;
        String result = "miss";

        for (SimpleDot dotToCheck: dotList) {
            result = dotToCheck.checkInput(guess);

            if (result.equals("hit")) {
                break;
            }

            if (result.equals("kill")) {
                dotList.remove(dotToCheck);
            }
        }

        System.out.println(result);
    }

}