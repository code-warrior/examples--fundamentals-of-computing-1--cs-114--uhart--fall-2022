import java.util.Scanner;

public class SimpleSwitchExample {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        switch(number) {
            case 1:
                /*
                 * Note how we didn't need to group the following statements
                 * inside curly braces.
                 */
                System.out.println("You entered the number 1.");
                System.out.println("Thanks for playing.");

                break;

            case 2: {
                /*
                 * You may use curly braces, if you wish. This is uncommon.
                 */
                System.out.println("You entered the number 2.");
                System.out.println("Thanks for playing.");

                break;
            }

            default: {
                /*
                 * You may also alter the location of your curly braces. This
                 * too is uncommon.
                 */
                System.out.println("You entered neither 1 nor 2.");
            }

                break;
        }

        input.close();
    }
}
