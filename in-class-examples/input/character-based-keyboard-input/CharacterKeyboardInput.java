import java.util.Scanner;

public class CharacterKeyboardInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        String line;

        // The long way of accepting character input
        System.out.print("Enter a character: ");
        line = input.next();
        letter = line.charAt(0);
        System.out.println("You entered " + letter);

        // The short way, using a method chain
        System.out.print("Enter a character: ");
        letter = input.next().charAt(0);

        System.out.println("You entered " + letter);

        input.close();
    }
}
