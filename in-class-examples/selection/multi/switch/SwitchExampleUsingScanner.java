import java.util.Scanner;

/* =============================================================================
   The following is an example of how switch works in Java, using Scanner.
   There is also an example of how nested method calls work.
   ========================================================================== */

public class SwitchExampleUsingScanner {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character");

        /*
         * Method next() of class Scanner (via input) will return a string. We
         * call method charAt with index 0 to retrieve the first character from
         * user input. switch(input.next().charAt(0)) is equivalent to
         *
         * String line;
         * char firstChar;
         * line = input.next();
         * firstChar = line.charAt(0);
         * switch(firstChar);
         *
         * You are advised to avoid writing code in this manner. I’ve  included
         * it only to put forth an example of how nested method calls work.
         */
        switch(input.next().charAt(0)) {
            default:
                System.out.printf( "You entered neither a nor b\n" );

                break;

            case 'b':
                System.out.println( "You entered b " );

                break;

            case 'a':
                System.out.print( "You entered the " );
                System.out.println( "letter a" );

                break;
        }

        input.close();
    }
}
