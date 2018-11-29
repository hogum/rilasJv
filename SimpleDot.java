public class SimpleDot {
    public String checkInput(String strGuess) {
        int guess = Integer.parseInt(strGuess);

        String result = "missed";


        for (int cell: locationCells) {
            if (guess == cell) {

                result = "hit";
            }
            hitsTotal++;

            break;
        }

        if (hitsTotal == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}