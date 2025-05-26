// Import scanner to read user's input
import java.util.Scanner;
public class CoinConverter {
    public static void main(String[] args) {
        // Assign new Scanner
        Scanner scanner = new Scanner(System.in);
        // Ask user to enter an amount of coins to convert.
        System.out.println("Enter amount of coins");
        // Read the user's input and assign it to variable coins.
        String coins = scanner.nextLine();       

        // Assign a result variable to save the result
        double result = 0;
        /* Assign the change rate which is used to convert the coins into
        into fictional US dollars. */
        double usd = 0.0045;
        /* Calculate the result by first converting the String into the data type Double
         * so the program has the abillity to calculate with given numbers. Then multiply
         * the number with the change rate to determine the result.*/
        result = Double.parseDouble(coins) * usd;
        // Print out the result and the used currency
        System.out.println(result + " USD");
        // Finally, close the scanner
        scanner.close();

        /* This program uses fake currency and fictional coins. */
    }
}