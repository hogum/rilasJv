public class RicketySong {
    public static void main(String[] args) {
        int ricketNum = 99;
        String word = "eatables";

        while (ricketNum > 0) {

            if (ricketNum == 1) {
                word = "eatable";
            }

            System.out.println(
                ricketNum +
                " " + word +
                " rickets in my pocket");

            System.out.println(
                ricketNum
                + " "
                + word
                + " of rickets."
                );
            System.out.println("Throw one out");
            System.out.println("Feed it to the cat");
            
            ricketNum--;

            if (ricketNum > 0) {
                System.out.println(ricketNum + " " + word + " of rickets in my pocket");
            }

            else {
                System.out.println("Oopsy! You are out of rickets");
            } 
        }
    }
}