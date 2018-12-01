import java.util.*;

public class DotBurst {
    
    private GameHelper helper = new GameHelper();
    private ArrayList<SimpleDot> dotList = new ArrayList<SimpleDot>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        SimpleDot firstDot = new SimpleDot();
        SimpleDot secondDot = new SimpleDot();
        SimpleDot thirdDot = new SimpleDot();

        firstDot.setName("Thingy Blue");
        secondDot.setName("Thingy Lost");
        thirdDot.setName("Thingy Big");

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
                break;
            }
        }

        System.out.println(result);
    }

    
    private void finishGame() {
        System.out.println("Opps! All dots dead");

        if (numOfGuesses <= 18) {
            System.out.println("Took you " + numOfGuesses + "guesses");
        }

        else {
            System.out.println("Took you long enough");
            System.out.println("The water's making you a laughing face");

        }
    }


    public static void main(String[] args) {

        DotBurst doDots = new DotBurst();
        doDots.setUpGame();
        doDots.startGame();
    }

}