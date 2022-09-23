import java.util.*;

public class SwitchExample {
    public static void main(String args[]) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        number = input.nextInt();

        switch(number) {
            // Note how we didn't need to group the following statements within curly braces.
            case 1:
                System.out.print( "You entered the " );
                System.out.println( "number 1" );

                break;

            case 2:
                System.out.println( "You entered the number 2 " );

                break;

            default:
                System.out.println( "You entered neither 1 nor 2" );

                break;
        }

        input.close();
    }
}
