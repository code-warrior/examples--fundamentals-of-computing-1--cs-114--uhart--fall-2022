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
        System.out.println("Let’s print the default values of an integer array:");
        for (int index = 0; index < LIMIT; index++) {
            System.out.println("list[" + index + "] is " + list[index]);

        list[5] = 999;  // change one array value
        /*
         * The following for loop uses the “length” property, which is available to
         * every array in Java.
         */
        // for (int index = 0; index < list.length; index++) {
        //     System.out.println("list[" + index + "] is " + list[index]);
        // }
        /*
         * The following for loop uses the ARRAY_LENGTH constant, which is an
         * assignment from the array’s “length” property.
         */
        // for (int index = 0; index < ARRAY_LENGTH; index++) {
        //     System.out.println("list[" + index + "] is " + list[index]);
        // }

        //  Print the array values using an enhanced for
        for (int value : list)
            System.out.print(value + "  ");
    }
}
