public class NestedIfStatements {
    public static void main(String[] args) {
        final int MAX_ATTEMPTS = 3;
        boolean passwordIsValid = true;

        /*
         * Although both of the if statements on line 12 and line 18 yield the
         * same results, the nested if statement on line X is more flexible, as
         * you’ll see in subsequent examples of the double selection if...else
         * structure.
         */
        if (MAX_ATTEMPTS != 4) {
            if (passwordIsValid == true) {
                System.out.println("\n\tYour password is valid. You may proceed.");
            }
        }

        if ((MAX_ATTEMPTS != 4) && (passwordIsValid == true)) {
            System.out.println("\n\tYour password is valid. You may proceed.");
        }
    }
}
