public class VariationsOfAForLoop {
    public static void main(String[] args) {
        System.out.println();

        // A basic for loop that iterates stepwise 10 times
        for(int i = 0; i < 10; i++) {
            System.out.println("The value of i is " + i);
        }

        System.out.println();

        /*
         * A for loop that runs infinitely. Use CNTRL + Z to exit.
         */
        // for( ; ; )
        //     ;

        /*
         * Another infinitely loop, this time with an expression in the test
         * condition section.
         */
        // for( ; true; )
        //     ;

        /*
         * The following for loop has its looping variable (int i) declared outside
         * of the for loop’s signature, meaning i’s scope extends beyond the for
         * loop’s bracketed region.
         */
        int i = 0;

        for( ; i < 10; i++) {
            System.out.println("The value of i is " + i);
        }

        System.out.println();

        i = 0;

        /*
         * The following for loop has its incremented section in the tail of the for
         * loop, not in its signature. Also note how i had to be set to “0” in order
         * to over-ride i’s value set on line 31.
         */
        for( ; i < 10; ) {
            System.out.println("The value of i is " + i);

            i++;
        }

        System.out.println();
    }
}
