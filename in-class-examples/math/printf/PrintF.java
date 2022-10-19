public class PrintF {
    public static void main(String[] args) {
        char firstLetter = 'R';
        String restOfFirstName = "oy";
        int x = 10;
        int y = 20;

        System.out.printf("%d\n", 10);
        System.out.printf("%d%n", 10);
        System.out.printf("%d is the magic number, as is %d\n", 10, 42);
        System.out.printf("%d%s%d\n", 10, " is the magic number, as is ", 42);
        System.out.printf("%s%c%s%n", "My name is ", firstLetter, restOfFirstName);
        System.out.printf("%d + %d = %d%n", x, y, (x + y));
   }
}
