import java.util.ArrayList;

public class SimpleDot {

    private ArrayList<String> locationCells;
    private String dotName;
    // int hitsTotal;
    // List<Integer> doneGuesses = new ArrayList<Integer>();

    
    public void setLocationCells(ArrayList<String> locations) {
        locationCells = locations;
    }


    public void setName(String name) {
        dotName = name;
    }

    public void sayDead () {
                
                System.out.println("\nKilled");
                System.out.println(dotName + " is done. Done for good\n");
    }

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

        return result;


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
            */
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