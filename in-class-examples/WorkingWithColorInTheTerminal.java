public class WorkingWithColorInTheTerminal {
    final static String YELLOW = "\033[33m";
    final static String RESET = "\033[39m";
    public static void main(String[] args) {
        System.out.printf("%s%s%s%s%s%n",
        "The following syntax is yellow→",
        YELLOW,
        "THIS CONTENT IS IN YELLOW",
        RESET,
        "←and this content was reset back to the default.");
    }
}
