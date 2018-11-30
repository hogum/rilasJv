import java.util.*z;

public class SimpleDot {

    int[] locationCells;
    int hitsTotal;
    List<Integer> doneGuesses = new ArrayList<Integer>();

    public String checkInput(String strGuess) {
        int guess = Integer.parseInt(strGuess);


        String result = "missed";


        for (int cell: locationCells) {
            if (guess == cell) {
                
                if (doneGuesses.contains(guess)) {
                    System.out.println("Same guess again " + guess);
                    break;
                }

                else {
                    result = "hit";
                    doneGuesses.add(guess);

                    hitsTotal++;
                    break;

                }
            }

        }

        if (hitsTotal == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

     public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    /*public boolean contains(final List<Integer> array, final int key) {
        for (int a: array) {
            if (a == key) {
                return true;
            }

         }
         return false;
         return ArrayList.contains(array, key);
    }*/
}