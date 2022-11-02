// **********************************************************************************
//  BasicArray.java       Author: Lewis/Loftus
//
//  Demonstrates basic array declaration and use.
// **********************************************************************************

public class BasicArray {
    // ------------------------------------------------------------------------------
    //  Creates an array, fills it with various integer values, modifies one value,
    //  then prints them out.
    // ------------------------------------------------------------------------------
    public static void main(String[] args) {
        final int LIMIT = 5,
            MULTIPLE = 10;

        /*
         * This could also have been written as, int list[] = new int[LIMIT],
         * similar to main(String[] args) or main(String args[]). This is called
         * alternate array syntax.
         */
        int[] list = new int[LIMIT];

        //  Initialize the array values
        for (int index = 0; index < LIMIT; index++)
            list[index] = index * MULTIPLE;

        list[5] = 999;  // change one array value

        //  Print the array values using an enhanced for
        for (int value : list)
            System.out.print(value + "  ");
    }
}
