import java.util.*;
import java.io.*;


public class GameHelper {

    private int dotsCount = 0;
    private int gridSize = 49;
    private int gridLength =7;
    private int [] grid = new int[gridSize];
    private static final String alphabets = "abcdefg";

    // Scanner readUserGuess = new Scanner(System.in);

    public String readGuess() {
        System.out.println("Give me a Guess");
        String inputLine = null;

        
        try {

            BufferedReader is = new BufferedReader(
                new InputStreamReader(System.in));

            inputLine = is.readLine();

            if (inputLine.length() == 0) {
                return null;
            }
        }

        catch (IOException e) {
            System.out.println("IOException: " + e);
        }

        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDot (int sizeOfDot) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String temp = null;
        boolean done = false;
        int [] coords = new int[sizeOfDot];
        int location = 0;
        int trials = 0;

        dotsCount++;
        int horizontalIncreament = 1;

        // If odd dot place vetically
        if ((dotsCount % 2) == 1) { 
            horizontalIncreament = gridLength;
        }

        while (! done & trials++ < 200) {
            location = (int) (Math.random() * gridSize);

            System.out.println("A thingy on " + location);

            int i = 0;

            done = true;

            while (done && i < dotsCount) {
                if (grid[location] == 0) {
                    coords[i++] = location;
                    location += horizontalIncreament;

                    if (location >= gridSize) {
                        done = false;
                    }

                    if (i > 0 && (location % gridLength == 0)) {
                        done = false;
                    }
                    
                }
                
                else {
                        // System.out.println("Used " + location);
                        done = false;
                }
                
            }
        }
            int i = 0; // Turn location to mainCoordinates
            int row = 0;
            int column = 0;

            while (i < dotsCount) {
                grid[coords[i]] = 1; // Mark main grid point as used
                row = (coords[i]) / gridLength; // Find row value
                column = coords[i] % gridLength;
                temp = String.valueOf(alphabets.charAt(column)); // convert to alpha

                alphaCells.add(temp.concat(Integer.toString(row)));
                i++;

                System.out.println(" \n coordinate" + i + " = " + alphaCells.get(i - 1));
            }

            return alphaCells;
    }

}