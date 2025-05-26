public class LatteOrderProgram {
    public static void main(String[] args) {
        // Enter which kind of Coffe was made.
        boolean isLatte = true;
        boolean isIced = true;
        boolean withMatcha = false;

        // Enter amount of items and vanilla pumps ordered
        int itemsOrdered = 3;
        int vanillaPumps = 2;

        if (isLatte) {
        /*If only isLatte is true print following ingredients:
        * esspresso, milk and syrup, 
        */
        System.out.println("espresso, milk and syrup.");
      } else if (isLatte && isIced) {
        /*If isLatte and isIced are true print following ingredients:
         * esspresso, milk, syrup and ice.
         */
        System.out.println("espresso, milk, syrup and ice.");  
      } else if (isLatte && withMatcha) { 
        /* If isLatte and withMatcha are true print following ingredients:
         * espresso, milk, syrup and matcha.
         */
        System.out.println("espresso, milk, syrup and matcha");
      } else if (isLatte && isIced && withMatcha) {
        /* If all variables based on coffee are true print following ingredients:
         * espresso, milk, syrup, ice and matcha.
         */
        System.out.println("espresso, milk, syrup, ice and matcha"); 
      } else { 
        /* If none coffee based variables are true print "Select a drinkt to get started!" */
        System.out.println("Select a drink to get started!");
    }

        if (itemsOrdered > 1) {
        /* If above 1 item ordered print: provide cup holder. */
        System.out.println("provide cup holder");
    }
        if (vanillaPumps >= 2) {
        /* If 2 or more Vanilla pumps print: charge $1 extra */
        System.out.println("charge $1 extra");
    }
        
    }
}