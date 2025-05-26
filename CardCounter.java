public class CardCounter {
    public static void main(String[] args) {
        /* Create a loop by assigning number 1 to variable "i" and
        if "i" is smaller than 52 add one to i" and repeat.*/
        for (int i = 1; i <= 52; i++) {
        /* While the loop is active print the amount of loops taken place by 
        saying: "Card" and the amount of loops */
        System.out.println("Card" + i);
        // if "i" is equal to x (in this case 32) print the result
        if (i == 32) {
        // "An incorret card was found in item" and it's number.
        System.out.println("An incorrect card was found in item " + i);
        // Afterwards, break the loop with function "break;"
        break;
    }
    }
  }
}
