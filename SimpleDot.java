import java.util.ArrayList;

public class SimpleDot {

    private ArrayList<String> locationCells;
    // int hitsTotal;
    // List<Integer> doneGuesses = new ArrayList<Integer>();

    public String checkInput(String strGuess) {
        
        int cellIndex = locationCells.indexOf(strGuess);
        String result = "missed";

        if (cellIndex >= 0) {
            locationCells.remove(cellIndex);

            if (locationCells.isEmpty()) {
                result = "kill";
            }

            else {
                result = "hit";
            }

        }

        /*for (int cell: locationCells) {
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
        */


        return result;
    }


     public void setLocationCells(ArrayList<String> locations) {
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