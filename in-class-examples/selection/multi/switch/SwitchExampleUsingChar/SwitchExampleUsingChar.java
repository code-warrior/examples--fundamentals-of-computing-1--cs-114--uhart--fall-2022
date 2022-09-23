import java.util.Scanner;

public class SwitchExampleUsingChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char singleLetter;

        // String line;
        // char firstChar;
        // line = input.next();
        // firstChar = line.charAt(0);
        // switch(firstChar);

        System.out.println("Enter a character");
        singleLetter = input.next().charAt(0);

        switch(singleLetter) {
            case 'a':
                System.out.print("You entered the letter a.");

                break;

            case 'b':
                System.out.println("You entered the letter b.");

                break;

            default:
                System.out.printf( "You entered neither a nor b\n" );

                break;
        }

        input.close();
    }
}
